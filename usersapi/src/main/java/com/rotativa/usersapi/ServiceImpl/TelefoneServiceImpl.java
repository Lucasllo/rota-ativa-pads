package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Telefone;
import com.rotativa.usersapi.Repositories.TelefoneRepository;
import com.rotativa.usersapi.Services.TelefoneService;

/**
 * Service Implementation for managing {@link Telefone}.
 */
@Service
@Transactional
public class TelefoneServiceImpl implements TelefoneService {

    private final Logger log = LoggerFactory.getLogger(TelefoneServiceImpl.class);

    private final TelefoneRepository telefoneRepository;

    public TelefoneServiceImpl(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    @Override
    public Telefone save(Telefone telefone) {
        log.debug("Request to save Telefone : {}", telefone);
        return telefoneRepository.save(telefone);
    }

    @Override
    public Telefone update(Telefone telefone) {
        log.debug("Request to save Telefone : {}", telefone);
        return telefoneRepository.save(telefone);
    }

    @Override
    public Optional<Telefone> partialUpdate(Telefone telefone) {
        log.debug("Request to partially update Telefone : {}", telefone);

        return telefoneRepository
            .findById(telefone.getId())
            .map(existingTelefone -> {
                if (telefone.getNumero() != null) {
                    existingTelefone.setNumero(telefone.getNumero());
                }

                return existingTelefone;
            })
            .map(telefoneRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Telefone> findAll() {
        log.debug("Request to get all Telefones");
        return telefoneRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Telefone> findOne(Long id) {
        log.debug("Request to get Telefone : {}", id);
        return telefoneRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Telefone : {}", id);
        telefoneRepository.deleteById(id);
    }
}
