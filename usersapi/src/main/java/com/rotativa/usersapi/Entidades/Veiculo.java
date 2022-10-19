package com.rotativa.usersapi.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVeiculo;
    @Column(name = "cor")
    private String cor;
    @Column(name = "placa")
    private String placa;
    @Column(name = "modelo")
    private String modelo;

    public Veiculo(int idVeiculo, String cor, String placa, String modelo) {
        this.idVeiculo = idVeiculo;
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idveiculo) {
        this.idVeiculo = idveiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}