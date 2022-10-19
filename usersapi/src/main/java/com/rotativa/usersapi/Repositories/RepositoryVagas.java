package com.rotativa.usersapi.Repositories;

import com.rotativa.usersapi.Entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmpresa extends JpaRepository<Vagas, Long>{
   
}
