package com.rotativa.usersapi.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rotativa.usersapi.Entidades.Empresa;
import com.rotativa.usersapi.Repositories.RepositoryEmpresa;

@Service
public class ServiceEmpresa {

    private RepositoryEmpresa repositorio;

    public ServiceEmpresa(RepositoryEmpresa repositorio){
        this.repositorio = repositorio;
    }

    public List<Empresa> getRepositorio(){
        return this.repositorio.findAll();
    }
 /*    Empresa ep1;
    ServiceEmpleado se1 = new ServiceEmpleado();

    public ServiceEmpresa(){
        Empleado emp1 = this.se1.getEmpleado();
        this.ep1 = new Empresa("Rota Ativa", "Ezequiel", 123456, "dasd", emp1);
    }

    public Empresa getEmpresa(){
        return this.ep1;
    }
*/
    

}
