package com.rotativa.usersapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.service.*;

import com.rotativa.usersapi.database.*;
import com.rotativa.usersapi.Entidades.*;

@Service("tipoPagamentoService")
public class TipoPagamentoImpl implements TipoPagamentoService{
	
    RepositorioTipoPagamento repositorioTipoPagamento;
	
	@Autowired
	public TipoPagamentoImpl(RepositorioTipoPagamento repositorioTipoPagamento) {
		this.repositorioTipoPagamento = repositorioTipoPagamento;
	}
	
	@Override
	public List<TipoPagamento> listar() {
        return repositorioTipoPagamento.findAll();
    }
    
	@Override
    public void salvar(TipoPagamento vagas) {
    	repositorioTipoPagamento.save(vagas);
    }

    @Override
    public void alterar(TipoPagamento vagas) {
        if(vagas.getIdTipoPagamento()>0){
            repositorioTipoPagamento.save(vagas);
        }        
    }

    @Override
    public void excluir(TipoPagamento usuario) {
        repositorioTipoPagamento.delete(usuario);        
    }
}

