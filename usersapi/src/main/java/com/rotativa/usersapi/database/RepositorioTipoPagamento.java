package com.rotativa.usersapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotativa.usersapi.Entidades.*;

public interface RepositorioTipoPagamento extends JpaRepository<TipoPagamento,Long> {
    
}
