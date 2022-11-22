package com.rotativa.usersapi.Services;
import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Pagamento;

/**
 * Service Interface for managing {@link Pagamento}.
 */
public interface PagamentoService {
    /**
     * Save a pagamento.
     *
     * @param pagamento the entity to save.
     * @return the persisted entity.
     */
    Pagamento save(Pagamento pagamento);

    /**
     * Updates a pagamento.
     *
     * @param pagamento the entity to update.
     * @return the persisted entity.
     */
    Pagamento update(Pagamento pagamento);

    /**
     * Partially updates a pagamento.
     *
     * @param pagamento the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Pagamento> partialUpdate(Pagamento pagamento);

    /**
     * Get all the pagamentos.
     *
     * @return the list of entities.
     */
    List<Pagamento> findAll();

    /**
     * Get the "id" pagamento.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Pagamento> findOne(Long id);

    /**
     * Delete the "id" pagamento.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
