package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Vaga;
import com.rotativa.usersapi.Repositories.VagaRepository;
import com.rotativa.usersapi.Services.VagaService;

@Service
@Transactional
public class VagaServiceImpl implements VagaService {

    private final Logger log = LoggerFactory.getLogger(VagaServiceImpl.class);

    private final VagaRepository vagaRepository;

    public VagaServiceImpl(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    @Override
    public Vaga save(Vaga vaga) {
        log.debug("Request to save Vaga : {}", vaga);
        return vagaRepository.save(vaga);
    }

    @Override
    public Vaga update(Vaga vaga) {
        log.debug("Request to save Vaga : {}", vaga);
        return vagaRepository.save(vaga);
    }

    @Override
    public Optional<Vaga> partialUpdate(Vaga vaga) {
        log.debug("Request to partially update Vaga : {}", vaga);

        return vagaRepository
            .findById(vaga.getId())
            .map(existingVaga -> {
                if (vaga.getLogradouro() != null) {
                    existingVaga.setLogradouro(vaga.getLogradouro());
                }
                if (vaga.getBairro() != null) {
                    existingVaga.setBairro(vaga.getBairro());
                }
                if (vaga.getAcessibilidade() != null) {
                    existingVaga.setAcessibilidade(vaga.getAcessibilidade());
                }
                if (vaga.getNome() != null) {
                    existingVaga.setNome(vaga.getNome());
                }
                if (vaga.getLongitudeInicial() != null) {
                    existingVaga.setLongitudeInicial(vaga.getLongitudeInicial());
                }
                if (vaga.getLongitudeFinal() != null) {
                    existingVaga.setLongitudeFinal(vaga.getLongitudeFinal());
                }
                if (vaga.getLatitudeInicial() != null) {
                    existingVaga.setLatitudeInicial(vaga.getLatitudeInicial());
                }
                if (vaga.getLatitudeFinal() != null) {
                    existingVaga.setLatitudeFinal(vaga.getLatitudeFinal());
                }

                return existingVaga;
            })
            .map(vagaRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vaga> findAll() {
        log.debug("Request to get all Vagas");
        return vagaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Vaga> findOne(Long id) {
        log.debug("Request to get Vaga : {}", id);
        return vagaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Vaga : {}", id);
        vagaRepository.deleteById(id);
    }

    @Override
    public List<Vaga> buscarVaga(String nome) {
        return vagaRepository.buscarVaga(nome);
    }
}
