package com.rotativa.usersapi.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Pagamento;
import com.rotativa.usersapi.Repositories.PagamentoRepository;
import com.rotativa.usersapi.Services.PagamentoService;

@Service
@Transactional
public class PagamentoServiceImpl implements com.rotativa.usersapi.Services.PagamentoService {

    private final Logger log = LoggerFactory.getLogger(PagamentoServiceImpl.class);

    private final PagamentoRepository pagamentoRepository;

    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Pagamento save(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Pagamento update(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Optional<Pagamento> partialUpdate(Pagamento pagamento) {

        return pagamentoRepository
            .findById(pagamento.getId())
            .map(existingPagamento -> {
                if (pagamento.getDataCompra() != null) {
                    existingPagamento.setDataCompra(pagamento.getDataCompra());
                }
                if (pagamento.getValor() != null) {
                    existingPagamento.setValor(pagamento.getValor());
                }
                if (pagamento.getQuantidadeTicket() != null) {
                    existingPagamento.setQuantidadeTicket(pagamento.getQuantidadeTicket());
                }

                return existingPagamento;
            })
            .map(pagamentoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pagamento> findAll() {
        return pagamentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pagamento> findOne(Long id) {
        return pagamentoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
