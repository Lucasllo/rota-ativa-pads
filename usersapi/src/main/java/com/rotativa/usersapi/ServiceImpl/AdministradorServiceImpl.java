package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Administrador;
import com.rotativa.usersapi.Repositories.AdministradorRepository;
import com.rotativa.usersapi.Services.AdministradorService;

@Service
@Transactional
public class AdministradorServiceImpl implements AdministradorService {

    private final AdministradorRepository administradorRepository;

    public AdministradorServiceImpl(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    @Override
    public Administrador save(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    @Override
    public Administrador update(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    @Override
    public Optional<Administrador> partialUpdate(Administrador administrador) {

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
        return administradorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Administrador> findOne(Long id) {
        return administradorRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        administradorRepository.deleteById(id);
    }
}
