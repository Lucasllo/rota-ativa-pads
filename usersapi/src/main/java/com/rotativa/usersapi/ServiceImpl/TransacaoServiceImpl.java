package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Transacao;
import com.rotativa.usersapi.Repositories.TransacaoRepository;
import com.rotativa.usersapi.Services.TransacaoService;

@Service
@Transactional
public class TransacaoServiceImpl implements TransacaoService {

    private final Logger log = LoggerFactory.getLogger(TransacaoServiceImpl.class);

    private final TransacaoRepository transacaoRepository;

    public TransacaoServiceImpl(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @Override
    public Transacao save(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    @Override
    public Transacao update(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    @Override
    public Optional<Transacao> partialUpdate(Transacao transacao) {

        return transacaoRepository
            .findById(transacao.getId())
            .map(existingTransacao -> {
                if (transacao.getEntrada() != null) {
                    existingTransacao.setEntrada(transacao.getEntrada());
                }
                if (transacao.getSaida() != null) {
                    existingTransacao.setSaida(transacao.getSaida());
                }
                if (transacao.getTicketUsado() != null) {
                    existingTransacao.setTicketUsado(transacao.getTicketUsado());
                }

                return existingTransacao;
            })
            .map(transacaoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Transacao> findAll() {
        return transacaoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Transacao> findOne(Long id) {
        return transacaoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        transacaoRepository.deleteById(id);
    }

    @Override
    public List<Transacao> getTransacoes(String nome) {
        return transacaoRepository.getTransacoes(nome);
    }
}