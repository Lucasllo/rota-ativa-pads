package com.rotativa.usersapi.Repositories;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import com.rotativa.usersapi.Entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface RepositoryVagas extends JpaRepository<Vagas, Long>{

  @Query(value = "select v.nomeVaga,sum(t.ticketsUsados) as ticketsUsados ,count(ve.placa) as total_veiculos,sec_to_time((sum(time_to_sec(timediff( t.saida,t.entrada))))) as tempoUso from usuario u "+
    "join transacao t "+
    "on u.idusuario = t.usuario_idusuario "+
    "join vaga v "+
    "on v.idvaga = t.vaga_idvaga "+
    "join usuario_has_veiculo hv "+
    "on u.idusuario = hv.usuario_idusuario "+
    "join veiculo ve "+
    "on ve.idveiculo = hv.veiculo_idveiculo "+
    "group by v.nomeVaga "+
    "order by v.nomeVaga ", nativeQuery = true)
    List<List<String>> relatorioFinanceiro();
    
    @Query(value = "select v.nomeVaga,u.nome,timediff( t.saida,t.entrada) as tempoUso,t.ticketsUsados as ticketsUsados ,ve.modelo,ve.placa,u.acessibilidade from usuario u "+
    "join transacao t "+
    "on u.idusuario = t.usuario_idusuario "+
    "join vaga v "+
    "on v.idvaga = t.vaga_idvaga "+
    "join usuario_has_veiculo hv "+
    "on u.idusuario = hv.usuario_idusuario "+
    "join veiculo ve "+
    "on ve.idveiculo = hv.veiculo_idveiculo "+
     "where v.nomeVaga = :nome" , nativeQuery = true) 
    List<List<String>> relatorioFinanceiroPorVaga(@Param("nome") String nome );
}
