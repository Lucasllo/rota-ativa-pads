package com.rotativa.usersapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.service.*;

import com.rotativa.usersapi.database.*;
import com.rotativa.usersapi.Entidades.*;
import com.rotativa.usersapi.Controllers.*;

@Service("pagamentoService")
public class PagamentoImpl implements PagamentoService{
	
    RepositorioPagamento repositorioPagamento;
	
	@Autowired
	public PagamentoImpl(RepositorioPagamento repositorioPagamento) {
		this.repositorioPagamento = repositorioPagamento;
	}
	
	@Override
	public List<Pagamento> listar() {
        return repositorioPagamento.findAll();
    }
    
	@Override
    public void salvar(Pagamento pagamento) {
    	repositorioPagamento.save(pagamento);
    }

    @Override
    public void alterar(Pagamento pagamento) {
        if(pagamento.getIdpagamento()>0){
            repositorioPagamento.save(pagamento);
        }        
    }

    @Override
    public void excluir(Pagamento pagamento) {
        repositorioPagamento.delete(pagamento);        
    }
}

