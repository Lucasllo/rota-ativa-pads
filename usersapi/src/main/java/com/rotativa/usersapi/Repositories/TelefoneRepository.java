package com.rotativa.usersapi.Repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rotativa.usersapi.Entidades.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {}
