package com.rotativa.usersapi.Entidades;

import java.util.List;
import java.util.Date;
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
@Table(name = "transacao")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTransacao;
    @Column(name = "vaga_idvaga")
    private int vaga_idvaga;
    @Column(name = "usuario_idusuario")
    private int usuario_idusuario;
    @Column(name = "entrada")
    private Date entrada;
    @Column(name = "saida")
    private Date saida;
    @Column(name = "ticketsUsados")
    private int ticketsUsados;

  public Transacao() {
        //
    }
  
     public Transacao(int idTransacao, int vaga_idvaga, int usuario_idusuario, Date entrada, Date saida, int ticketsUsados) {
        this.idTransacao = idTransacao;
        this.vaga_idvaga = vaga_idvaga;
        this.usuario_idusuario = usuario_idusuario;
        this.entrada = entrada;
        this.saida = saida;
        this.ticketsUsados = ticketsUsados;
    }
    
    public int getTicketsUsados() {
        return ticketsUsados;
    }

    public void setTicketsUsados(int ticketsUsados) {
        this.ticketsUsados = ticketsUsados;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public int getVaga_idvaga() {
        return vaga_idvaga;
    }

    public void setVaga_idvaga(int vaga_idvaga) {
        this.vaga_idvaga = vaga_idvaga;
    }

    public int getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(int usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

  public Date getSaida() {
        return saida;
    }

    public void setSaida (Date saida) {
        this.saida = saida;
    }


    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada (Date entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Vagas {" +
                "id='" + idTransacao + '\'' +
                ", vaga='" + vaga_idvaga + '\'' +
                ", usuario ='" + usuario_idusuario + '\'' +
                ", entrada='" + entrada + '\'' +
                ", saida='" + saida + '\'' +
                ", ticketsUsados='" + ticketsUsados + '\'' +
                '}';
    }
}

