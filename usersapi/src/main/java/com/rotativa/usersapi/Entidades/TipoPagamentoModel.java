package com.rotativa.usersapi.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipopagamento",schema = "rotaativa")
public class TipoPagamentoModel {
   @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_pagamento")
    private int idTipoPagamento;
    @Column(name = "tipo_pagamento")
    private String tipoPagamento;
    @Column(name = "desc_pagamento")
    private String descPagamento;
    @ManyToOne
    @JoinColumn(name="pagamento_id_pagamento")
    private PagamentoModel pagamentoIdPagamento;

    public int getIdTipoPagamento() {
        return idTipoPagamento;
    }
    public void setIdTipoPagamento(int idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }
    public String getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public String getDescPagamento() {
        return descPagamento;
    }
    public void setDescPagamento(String descPagamento) {
        this.descPagamento = descPagamento;
    }
    
    public PagamentoModel getPagamentoIdPagamento() {
        return pagamentoIdPagamento;
    }
    public void setPagamentoIdPagamento(PagamentoModel pagamentoIdPagamento) {
        this.pagamentoIdPagamento = pagamentoIdPagamento;
    }
}
