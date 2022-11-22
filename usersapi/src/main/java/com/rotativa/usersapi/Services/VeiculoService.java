package com.rotativa.usersapi.Services;
import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Veiculo;

/**
 * Service Interface for managing {@link Veiculo}.
 */
public interface VeiculoService {
    /**
     * Save a veiculo.
     *
     * @param veiculo the entity to save.
     * @return the persisted entity.
     */
    Veiculo save(Veiculo veiculo);

    /**
     * Updates a veiculo.
     *
     * @param veiculo the entity to update.
     * @return the persisted entity.
     */
    Veiculo update(Veiculo veiculo);

    /**
     * Partially updates a veiculo.
     *
     * @param veiculo the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Veiculo> partialUpdate(Veiculo veiculo);

    /**
     * Get all the veiculos.
     *
     * @return the list of entities.
     */
    List<Veiculo> findAll();

    /**
     * Get the "id" veiculo.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Veiculo> findOne(Long id);

    /**
     * Delete the "id" veiculo.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
