package com.rotativa.usersapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rotativa.usersapi.entidades.*;

@Repository
public interface RepositoryPagamento extends JpaRepository<Pagamento, Long>{
   
}
