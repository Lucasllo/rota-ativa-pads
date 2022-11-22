package com.rotativa.usersapi.Services;
import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Telefone;

/**
 * Service Interface for managing {@link Telefone}.
 */
public interface TelefoneService {
    /**
     * Save a telefone.
     *
     * @param telefone the entity to save.
     * @return the persisted entity.
     */
    Telefone save(Telefone telefone);

    /**
     * Updates a telefone.
     *
     * @param telefone the entity to update.
     * @return the persisted entity.
     */
    Telefone update(Telefone telefone);

    /**
     * Partially updates a telefone.
     *
     * @param telefone the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Telefone> partialUpdate(Telefone telefone);

    /**
     * Get all the telefones.
     *
     * @return the list of entities.
     */
    List<Telefone> findAll();

    /**
     * Get the "id" telefone.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Telefone> findOne(Long id);

    /**
     * Delete the "id" telefone.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
