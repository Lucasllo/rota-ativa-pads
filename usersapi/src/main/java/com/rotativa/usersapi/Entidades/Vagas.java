package com.rotativa.usersapi.Entidades;

import java.beans.Transient;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity; 
import javax.persistence.Column;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vaga")
public class Vagas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVaga;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "horaEntrada")
    private Date entrada;
    @Column(name = "horaSaida")
    private Date saida;

     public Vagas(int idVaga, String logradouro, String bairro, Date entrada, Date saida) {
        this.idVaga = idVaga;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.entrada = entrada;
        this.saida = saida;
    }
    
    @ManyToMany
    @JoinTable(name = "Vaga_Usuario", 
      joinColumns = @JoinColumn(name = "idVaga"), 
      inverseJoinColumns = @JoinColumn(name = "idUsuario"))
    
    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public int getIdvaga() {
        return idVaga;
    }

    public void setIdvaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Vagas {" +
                "id='" + idVaga + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro ='" + bairro + '\'' +
                ", entrada='" + entrada + '\'' +
                ", saida='" + saida + '\'' +
                '}';
    }
}

