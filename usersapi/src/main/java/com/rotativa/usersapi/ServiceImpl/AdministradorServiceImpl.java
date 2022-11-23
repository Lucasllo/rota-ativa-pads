package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Administrador;
import com.rotativa.usersapi.Repositories.AdministradorRepository;
import com.rotativa.usersapi.Services.AdministradorService;

@Service
@Transactional
public class AdministradorServiceImpl implements AdministradorService {

    private final Logger log = LoggerFactory.getLogger(AdministradorServiceImpl.class);

    private final AdministradorRepository administradorRepository;

    public AdministradorServiceImpl(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    @Override
    public Administrador save(Administrador administrador) {
        log.debug("Request to save Administrador : {}", administrador);
        return administradorRepository.save(administrador);
    }

    @Override
    public Administrador update(Administrador administrador) {
        log.debug("Request to save Administrador : {}", administrador);
        return administradorRepository.save(administrador);
    }

    @Override
    public Optional<Administrador> partialUpdate(Administrador administrador) {
        log.debug("Request to partially update Administrador : {}", administrador);

        return administradorRepository
            .findById(administrador.getId())
            .map(existingAdministrador -> {
                if (administrador.getNome() != null) {
                    existingAdministrador.setNome(administrador.getNome());
                }
                if (administrador.getCpf() != null) {
                    existingAdministrador.setCpf(administrador.getCpf());
                }
                if (administrador.getEmail() != null) {
                    existingAdministrador.setEmail(administrador.getEmail());
                }
                if (administrador.getNascimento() != null) {
                    existingAdministrador.setNascimento(administrador.getNascimento());
                }
                if (administrador.getSenha() != null) {
                    existingAdministrador.setSenha(administrador.getSenha());
                }

                return existingAdministrador;
            })
            .map(administradorRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Administrador> findAll() {
        log.debug("Request to get all Administradors");
        return administradorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Administrador> findOne(Long id) {
        log.debug("Request to get Administrador : {}", id);
        return administradorRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Administrador : {}", id);
        administradorRepository.deleteById(id);
    }
}
