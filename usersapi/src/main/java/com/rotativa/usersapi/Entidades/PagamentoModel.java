package com.rotativa.usersapi.Entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity; //O uso de @Entity identifica uma classe como Entidade
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; //identificando chave primária para o framework
import javax.persistence.Table;

@Entity
@Table(name = "pagamento",schema = "rotaativa")
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pagamento")
    private int idPagamento;
    @Column(name = "data_compra")
    private Date dataCompra;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "quantidade_ticket")
    private int quantidadeTicket;
    @ManyToOne
    @JoinColumn(name="usuario_idusuario")
    private UsuarioModel usuario;

    
    public int getIdpagamento() {
        return idPagamento;
    }

    public void setIdpagamento(int idpagamento) {
        this.idPagamento = idpagamento;
    }
    public Date getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public int getQuantidadeTicket() {
        return quantidadeTicket;
    }
    
    public void setQuantidadeTicket(int quantidadeTicket) {
        this.quantidadeTicket = quantidadeTicket;
    }
    
    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    
}
