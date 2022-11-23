package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.TipoPagamento;
import com.rotativa.usersapi.Repositories.TipoPagamentoRepository;
import com.rotativa.usersapi.Services.TipoPagamentoService;

@Service
@Transactional
public class TipoPagamentoServiceImpl implements TipoPagamentoService {

    private final Logger log = LoggerFactory.getLogger(TipoPagamentoServiceImpl.class);

    private final TipoPagamentoRepository tipoPagamentoRepository;

    public TipoPagamentoServiceImpl(TipoPagamentoRepository tipoPagamentoRepository) {
        this.tipoPagamentoRepository = tipoPagamentoRepository;
    }

    @Override
    public TipoPagamento save(TipoPagamento tipoPagamento) {
        log.debug("Request to save TipoPagamento : {}", tipoPagamento);
        return tipoPagamentoRepository.save(tipoPagamento);
    }

    @Override
    public TipoPagamento update(TipoPagamento tipoPagamento) {
        log.debug("Request to save TipoPagamento : {}", tipoPagamento);
        return tipoPagamentoRepository.save(tipoPagamento);
    }

    @Override
    public Optional<TipoPagamento> partialUpdate(TipoPagamento tipoPagamento) {
        log.debug("Request to partially update TipoPagamento : {}", tipoPagamento);

        return tipoPagamentoRepository
            .findById(tipoPagamento.getId())
            .map(existingTipoPagamento -> {
                if (tipoPagamento.getNome() != null) {
                    existingTipoPagamento.setNome(tipoPagamento.getNome());
                }
                if (tipoPagamento.getDescricao() != null) {
                    existingTipoPagamento.setDescricao(tipoPagamento.getDescricao());
                }

                return existingTipoPagamento;
            })
            .map(tipoPagamentoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TipoPagamento> findAll() {
        log.debug("Request to get all TipoPagamentos");
        return tipoPagamentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TipoPagamento> findOne(Long id) {
        log.debug("Request to get TipoPagamento : {}", id);
        return tipoPagamentoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete TipoPagamento : {}", id);
        tipoPagamentoRepository.deleteById(id);
    }
}
