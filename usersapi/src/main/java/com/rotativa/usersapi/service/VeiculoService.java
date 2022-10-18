package com.rotativa.usersapi.service;
// interface criada em arquivo separado para manter a privacidade da implementação dos métodos.
import java.util.List;

import org.springframework.stereotype.Component;
import com.rotativa.usersapi.Entidades.*;

@Component
public interface VeiculoService {
 
    public List<Veiculo> listar();
    
    public void salvar(Veiculo veiculo);

    public void alterar(Veiculo veiculo);

    public void excluir(Veiculo veiculo);
}