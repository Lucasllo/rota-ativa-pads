package com.rotativa.usersapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotativa.usersapi.entidades.Usuario;

public interface RepositorioUser extends JpaRepository<Usuario,Long> {
    
}
