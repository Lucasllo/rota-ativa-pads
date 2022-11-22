package com.rotativa.usersapi.Services;
import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Transacao;

/**
 * Service Interface for managing {@link Transacao}.
 */
public interface TransacaoService {

    List<Transacao> getTransacoes(String nome);    

    /**
     * Save a transacao.
     *
     * @param transacao the entity to save.
     * @return the persisted entity.
     */
    Transacao save(Transacao transacao);

    /**
     * Updates a transacao.
     *
     * @param transacao the entity to update.
     * @return the persisted entity.
     */
    Transacao update(Transacao transacao);

    /**
     * Partially updates a transacao.
     *
     * @param transacao the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Transacao> partialUpdate(Transacao transacao);

    /**
     * Get all the transacaos.
     *
     * @return the list of entities.
     */
    List<Transacao> findAll();

    /**
     * Get the "id" transacao.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Transacao> findOne(Long id);

    /**
     * Delete the "id" transacao.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
