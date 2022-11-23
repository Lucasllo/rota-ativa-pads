package com.rotativa.usersapi.Repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rotativa.usersapi.Entidades.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {}
