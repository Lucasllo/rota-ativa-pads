package com.rotativa.usersapi.service;
// interface criada em arquivo separado para manter a privacidade da implementação dos métodos.
import java.util.List;

import org.springframework.stereotype.Component;
import com.rotativa.usersapi.Entidades.*;

@Component
public interface TipoPagamentoService {
 
    public List<TipoPagamento> listar();
    
    public void salvar(TipoPagamento tipoPagamento);

    public void alterar(TipoPagamento tipoPagamento);

    public void excluir(TipoPagamento tipoPagamento);
}