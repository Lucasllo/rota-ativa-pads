package com.rotativa.usersapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rotativa.usersapi.Entidades.Empresa;
import com.rotativa.usersapi.Services.ServiceEmpresa;

@RestController
public class ControlEmpresa {
  /*  ServiceEmpresa se1 = new ServiceEmpresa();
    Empresa emp1;

    public ControllerEmpresa(){
        this.emp1 = this.se1.getEmpresa();
    }


    @GetMapping("/informacion")
    public Empresa informacion(){
        return this.emp1;
    }*/ 
    ServiceEmpresa se1;

    public ControlEmpresa(ServiceEmpresa se1){
        this.se1 = se1;
    }

    @GetMapping("/informacion")
    public List<Empresa> informacion(){
        return this.se1.getRepositorio();
    }
}
