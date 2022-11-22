package com.rotativa.usersapi.Repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rotativa.usersapi.Entidades.Veiculo;

/**
 * Spring Data SQL repository for the Veiculo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {}
