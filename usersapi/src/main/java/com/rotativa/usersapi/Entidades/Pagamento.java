package com.rotativa.usersapi.Entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pagamento;
    @Column(name = "dataCompra")
    private Date dataCompra;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "quantidadeTicket")
    private int quantidadeTicket;

  public Pagamento() {
       //
    }

      public Pagamento(int idPagamento, Date dataCompra, Double valor, int quantidadeTicket) {
        this.id_pagamento = idPagamento;
        this.dataCompra = dataCompra;
        this.valor = valor;
        this.quantidadeTicket = quantidadeTicket;
    }
        
    public int getIdpagamento() {
        return id_pagamento;
    }
    public void setIdpagamento(int idPagamento) {
        this.id_pagamento = idPagamento;
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
    
     @Override
    public String toString() {
        return "Pagamento {" +
        "data da compra='" + dataCompra + '\'' +
        ", valor='" + valor + '\'' +
        ", Tickets='" + quantidadeTicket + '\'' +
        '}'; 
}
}
