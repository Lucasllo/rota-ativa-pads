package com.rotativa.usersapi.Repositories;

import com.rotativa.usersapi.Entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmpresa extends JpaRepository<Usuario, Long>{
    /*    List<Usuario> findByNome(String nome); */
   /*  Usuario buscarPessoaPorNome(String nome); */

    @Query(value = "SELECT * FROM usuario WHERE usuario.nome = :nome",  nativeQuery = true)
    List<Usuario> carregarPorNome(@Param("nome") String nome);
}
