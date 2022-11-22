package com.rotativa.usersapi.Services;
import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.TipoPagamento;

/**
 * Service Interface for managing {@link TipoPagamento}.
 */
public interface TipoPagamentoService {
    /**
     * Save a tipoPagamento.
     *
     * @param tipoPagamento the entity to save.
     * @return the persisted entity.
     */
    TipoPagamento save(TipoPagamento tipoPagamento);

    /**
     * Updates a tipoPagamento.
     *
     * @param tipoPagamento the entity to update.
     * @return the persisted entity.
     */
    TipoPagamento update(TipoPagamento tipoPagamento);

    /**
     * Partially updates a tipoPagamento.
     *
     * @param tipoPagamento the entity to update partially.
     * @return the persisted entity.
     */
    Optional<TipoPagamento> partialUpdate(TipoPagamento tipoPagamento);

    /**
     * Get all the tipoPagamentos.
     *
     * @return the list of entities.
     */
    List<TipoPagamento> findAll();

    /**
     * Get the "id" tipoPagamento.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TipoPagamento> findOne(Long id);

    /**
     * Delete the "id" tipoPagamento.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
