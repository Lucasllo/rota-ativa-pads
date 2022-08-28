package com.rotativa.usersapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.service.UserService;
import com.rotativa.usersapi.database.RepositorioUser;
import com.rotativa.usersapi.entidades.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	RepositorioUser repositorioUser;
	
	@Autowired
	public UserServiceImpl(RepositorioUser repositorioUser) {
		this.repositorioUser = repositorioUser;
	}
	
	@Override
	public List<User> listar() {
        return repositorioUser.findAll();
    }
    
	@Override
    public void salvar(User users) {
    	repositorioUser.save(users);
    }

    @Override
    public void alterar(User usuario) {
        if(usuario.getId()>0){
            repositorioUser.save(usuario);
        }        
    }

    @Override
    public void excluir(User usuario) {
        repositorioUser.delete(usuario);        
    }
}

