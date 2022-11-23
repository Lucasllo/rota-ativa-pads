package com.rotativa.usersapi.Repositories;

import com.rotativa.usersapi.Entidades.Administrador;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {}
