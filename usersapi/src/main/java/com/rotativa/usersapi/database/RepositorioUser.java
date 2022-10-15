package com.rotativa.usersapi.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rotativa.usersapi.entidades.*;

public interface RepositorioUser extends JpaRepository<Usuario, Long> {
 /*    List<Usuario> findByNome(String nome); */
   /*  Usuario buscarPessoaPorNome(String nome); */

    @Query(value = "SELECT * FROM usuario WHERE usuario.nome = :nome",  nativeQuery = true)
    List<Usuario> carregarPorNome(@Param("nome") String nome);
    
}
