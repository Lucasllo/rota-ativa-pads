package com.rotativa.usersapi.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "empresaEmpleadoPertenece")
    private String empresaEmpleadoPertenece;
    @Column(name = "rolEmpleado")
    private String rolEmpleado;

    @Transient
    MovimientoDinero movimento1;

    public Empleado(String nombre, String correo, String empresaEmpleadoPertenece, String rolEmpleado,
            MovimientoDinero movimento1) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
        this.rolEmpleado = rolEmpleado;
        this.movimento1 = movimento1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleadoPertenece() {
        return empresaEmpleadoPertenece;
    }

    public void setEmpresaEmpleadoPertenece(String empresaEmpleadoPertenece) {
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimento1() {
        return movimento1;
    }

    public void setMovimento1(MovimientoDinero movimento1) {
        this.movimento1 = movimento1;
    }

    @Override
    public String toString() {
        return "Empleado {"+
        "nombre='" + nombre + '\'' +
        ", correo='" + correo + '\'' +
        ", empresaEmpleadoPertenece='" + empresaEmpleadoPertenece + '\'' +
        ", rolEmpleado='" + rolEmpleado + '\'' +
        ", movimento1='" + this.movimento1 +
        '}' ;
            
    }
    
}
