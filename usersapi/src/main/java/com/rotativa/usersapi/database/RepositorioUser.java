package com.rotativa.usersapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotativa.usersapi.entidades.User;

public interface RepositorioUser extends JpaRepository<User,Long> {
    
}
