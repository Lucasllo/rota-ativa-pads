package com.rotativa.usersapi.Services;

import com.rotativa.usersapi.Entidades.Empleado;

public class ServiceEmpleado {
    Empleado emp1;
    
    public ServiceEmpleado(){
        this.emp1 = new Empleado("Ezequiel", "ag@g.com", "TESTE", "TESTE EMPRE", null);

    }

    public Empleado getEmpleado(){
        return this.emp1;
    }
}
