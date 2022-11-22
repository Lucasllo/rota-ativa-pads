package com.rotativa.usersapi.Repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rotativa.usersapi.Entidades.Transacao;

/**
 * Spring Data SQL repository for the Transacao entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {}
