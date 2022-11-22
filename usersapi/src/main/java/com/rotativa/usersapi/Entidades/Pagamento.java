package com.rotativa.usersapi.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A Pagamento.
 */
@Entity
@Table(name = "pagamento")
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "data_compra")
    private LocalDate dataCompra;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "quantidade_ticket")
    private Integer quantidadeTicket;

    @ManyToOne
    @JsonIgnoreProperties(value = { "pagamentos", "telefones", "transacoes", "veiculos" }, allowSetters = true)
    private Usuario usuario;

    @ManyToOne
    private TipoPagamento tipoPagamento;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Pagamento id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCompra() {
        return this.dataCompra;
    }

    public Pagamento dataCompra(LocalDate dataCompra) {
        this.setDataCompra(dataCompra);
        return this;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getValor() {
        return this.valor;
    }

    public Pagamento valor(Double valor) {
        this.setValor(valor);
        return this;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeTicket() {
        return this.quantidadeTicket;
    }

    public Pagamento quantidadeTicket(Integer quantidadeTicket) {
        this.setQuantidadeTicket(quantidadeTicket);
        return this;
    }

    public void setQuantidadeTicket(Integer quantidadeTicket) {
        this.quantidadeTicket = quantidadeTicket;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pagamento usuario(Usuario usuario) {
        this.setUsuario(usuario);
        return this;
    }

    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Pagamento tipoPagamento(TipoPagamento tipoPagamento) {
        this.setTipoPagamento(tipoPagamento);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pagamento)) {
            return false;
        }
        return id != null && id.equals(((Pagamento) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Pagamento{" +
            "id=" + getId() +
            ", dataCompra='" + getDataCompra() + "'" +
            ", valor=" + getValor() +
            ", quantidadeTicket=" + getQuantidadeTicket() +
            "}";
    }
}
