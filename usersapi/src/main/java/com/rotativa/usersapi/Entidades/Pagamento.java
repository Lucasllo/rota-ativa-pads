package com.rotativa.usersapi.Entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagamento;
    @Column(name = "dataCompra")
    private Date dataCompra;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "quantidadeTicket")
    private int quantidadeTicket;

    @Transient
    Usuario us1;
        
    public int getIdpagamento() {
        return idPagamento;
    }

    public Usuario getUsuario() {
        return us1;
    }
    public void setUsuario(Usuario us1) {
        this.us1 = us1;
    }
    public void setIdpagamento(int idpagamento) {
        this.idPagamento = idPagamento;
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
        // TODO Auto-generated method stub
        return super.toString();
    }
}
