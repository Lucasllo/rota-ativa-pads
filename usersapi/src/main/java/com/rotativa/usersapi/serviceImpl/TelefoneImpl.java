package com.rotativa.usersapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.service.*;

import com.rotativa.usersapi.database.*;
import com.rotativa.usersapi.Entidades.*;

@Service("telefoneService")
public class TelefoneImpl implements TelefoneService{
	
    RepositorioTelefone repositorioTelefone;
	
	@Autowired
	public TelefoneImpl(RepositorioTelefone repositorioTelefone) {
		this.repositorioTelefone = repositorioTelefone;
	}
	
	@Override
	public List<Telefone> listar() {
        return repositorioTelefone.findAll();
    }
    
	@Override
    public void salvar(Telefone telefone) {
    	repositorioTelefone.save(telefone);
    }

    @Override
    public void alterar(Telefone telefone) {
        if(telefone.getIdtelefone()>0){
            repositorioTelefone.save(telefone);
        }        
    }

    @Override
    public void excluir(Telefone telefone) {
        repositorioTelefone.delete(telefone);        
    }
}

