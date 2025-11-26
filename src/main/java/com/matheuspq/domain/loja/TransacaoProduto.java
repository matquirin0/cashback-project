package com.matheuspq.domain.loja;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transacoes_produtos")
public class TransacaoProduto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransacaoProduto;
	private int quantidade;
	private BigDecimal valorUnitario;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	@ManyToOne 
	@JoinColumn(name = "transacao_id")
	private Transacao transacao;
	
	public TransacaoProduto() {

	}

	public TransacaoProduto(int quantidade, BigDecimal valorUnitario) {
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public Long getIdTransacaoProduto() {
		return idTransacaoProduto;
	}

	public void setIdTransacaoProduto(Long idTransacaoProduto) {
		this.idTransacaoProduto = idTransacaoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTransacaoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransacaoProduto other = (TransacaoProduto) obj;
		return Objects.equals(idTransacaoProduto, other.idTransacaoProduto);
	}
}
