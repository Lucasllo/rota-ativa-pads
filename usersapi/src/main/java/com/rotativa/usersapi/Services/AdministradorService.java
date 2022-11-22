package com.rotativa.usersapi.Services;

import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Administrador;

/**
 * Service Interface for managing {@link Administrador}.
 */
public interface AdministradorService {
    /**
     * Save a administrador.
     *
     * @param administrador the entity to save.
     * @return the persisted entity.
     */
    Administrador save(Administrador administrador);

    /**
     * Updates a administrador.
     *
     * @param administrador the entity to update.
     * @return the persisted entity.
     */
    Administrador update(Administrador administrador);

    /**
     * Partially updates a administrador.
     *
     * @param administrador the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Administrador> partialUpdate(Administrador administrador);

    /**
     * Get all the administradors.
     *
     * @return the list of entities.
     */
    List<Administrador> findAll();

    /**
     * Get the "id" administrador.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Administrador> findOne(Long id);

    /**
     * Delete the "id" administrador.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
