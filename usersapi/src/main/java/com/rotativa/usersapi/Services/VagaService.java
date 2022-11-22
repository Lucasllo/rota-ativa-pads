package com.rotativa.usersapi.Services;
import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Vaga;

/**
 * Service Interface for managing {@link Vaga}.
 */
public interface VagaService {

    List<Vaga> buscarVaga(String nome);

    /**
     * Save a vaga.
     *
     * @param vaga the entity to save.
     * @return the persisted entity.
     */
    Vaga save(Vaga vaga);

    /**
     * Updates a vaga.
     *
     * @param vaga the entity to update.
     * @return the persisted entity.
     */
    Vaga update(Vaga vaga);

    /**
     * Partially updates a vaga.
     *
     * @param vaga the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Vaga> partialUpdate(Vaga vaga);

    /**
     * Get all the vagas.
     *
     * @return the list of entities.
     */
    List<Vaga> findAll();

    /**
     * Get the "id" vaga.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Vaga> findOne(Long id);

    /**
     * Delete the "id" vaga.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
