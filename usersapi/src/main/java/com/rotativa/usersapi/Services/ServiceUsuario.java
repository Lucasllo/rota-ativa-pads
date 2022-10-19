package com.rotativa.usersapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.service.UserService;
import com.rotativa.usersapi.database.RepositoryUsuario;
import com.rotativa.usersapi.entidades.Usuario;

@Service
public class ServiceUsuario{
	
	private RepositoryUsuario repositorio;
	
	@Autowired
	public ServiceUsuario(RepositoryUsuario repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public List<Usuario> listar() {
        return repositorio.findAll();
    }
    
	@Override
    public void salvar(Usuario users) {
    	repositorio.save(users);
    }

    @Override
    public void alterar(Usuario usuario) {
        if(usuario.getIdusuario()>0){
            repositorio.save(usuario);
        }        
    }

    @Override
    public void excluir(Usuario usuario) {
        repositorio.delete(usuario);        
    }

    @Override
    public List<Usuario> carregarPorNome(String nome) {
        return repositorio.carregarPorNome(nome);
    }
}