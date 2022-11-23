package com.rotativa.usersapi.Services;

import java.util.List;
import java.util.Optional;

import com.rotativa.usersapi.Entidades.Administrador;

public interface AdministradorService {

    Administrador save(Administrador administrador);

    Administrador update(Administrador administrador);

    Optional<Administrador> partialUpdate(Administrador administrador);

    List<Administrador> findAll();

    Optional<Administrador> findOne(Long id);

    void delete(Long id);
}
