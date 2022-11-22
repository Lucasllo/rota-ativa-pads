package com.rotativa.usersapi.Repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rotativa.usersapi.Entidades.TipoPagamento;

/**
 * Spring Data SQL repository for the TipoPagamento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TipoPagamentoRepository extends JpaRepository<TipoPagamento, Long> {}
