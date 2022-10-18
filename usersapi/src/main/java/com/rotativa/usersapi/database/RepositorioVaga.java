package com.rotativa.usersapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotativa.usersapi.Entidades.*;

public interface RepositorioVaga extends JpaRepository<Vagas,Long> {
    
}
