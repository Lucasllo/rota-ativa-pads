package com.rotativa.usersapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotativa.usersapi.entidades.*;

public interface RepositorioPagamento extends JpaRepository<Pagamento, Long> {

    
}
