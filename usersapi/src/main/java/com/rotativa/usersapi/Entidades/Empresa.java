package com.rotativa.usersapi.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direction")
    private String direction;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "nit")
    private String nit;

    @Transient
    Empleado empleado1;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empresa(String nombre, String direction, int telefono, String nit, Empleado empleado1) {
        this.nombre = nombre;
        this.direction = direction;
        this.telefono = telefono;
        this.nit = nit;
        this.empleado1 = empleado1;
    }
    @Override
    public String toString() {
        return "Empresa{" +
        "nombre='" + nombre + '\'' +
        ", direction='" + direction + '\'' +
        ", telefono='" + telefono + '\'' +
        ", nit='" + nit + '\'' +
        ", empleado='" + this.empleado1 + 
        '}'; 
      
    }
}
