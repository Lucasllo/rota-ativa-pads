package com.rotativa.usersapi.ServiceImpl;


import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Veiculo;
import com.rotativa.usersapi.Repositories.VeiculoRepository;
import com.rotativa.usersapi.Services.VeiculoService;

/**
 * Service Implementation for managing {@link Veiculo}.
 */
@Service
@Transactional
public class VeiculoServiceImpl implements VeiculoService {

    private final Logger log = LoggerFactory.getLogger(VeiculoServiceImpl.class);

    private final VeiculoRepository veiculoRepository;

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        log.debug("Request to save Veiculo : {}", veiculo);
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Veiculo update(Veiculo veiculo) {
        log.debug("Request to save Veiculo : {}", veiculo);
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Optional<Veiculo> partialUpdate(Veiculo veiculo) {
        log.debug("Request to partially update Veiculo : {}", veiculo);

        return veiculoRepository
            .findById(veiculo.getId())
            .map(existingVeiculo -> {
                if (veiculo.getCor() != null) {
                    existingVeiculo.setCor(veiculo.getCor());
                }
                if (veiculo.getPlaca() != null) {
                    existingVeiculo.setPlaca(veiculo.getPlaca());
                }
                if (veiculo.getModeloe() != null) {
                    existingVeiculo.setModeloe(veiculo.getModeloe());
                }

                return existingVeiculo;
            })
            .map(veiculoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Veiculo> findAll() {
        log.debug("Request to get all Veiculos");
        return veiculoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Veiculo> findOne(Long id) {
        log.debug("Request to get Veiculo : {}", id);
        return veiculoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Veiculo : {}", id);
        veiculoRepository.deleteById(id);
    }
}
