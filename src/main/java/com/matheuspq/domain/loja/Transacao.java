package com.matheuspq.domain.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.matheuspq.domain.pontos.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transacoes")
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Cliente cliente;
	private LocalDateTime data;
	private BigDecimal valorTotal;
	private List<TransacaoProduto> transacaoItem; 
	
	public Transacao() {
		
	}

	public Transacao(Cliente cliente, LocalDateTime data, BigDecimal valorTotal,
			List<TransacaoProduto> transacaoItem) {
		this.cliente = cliente;
		this.data = data;
		this.valorTotal = valorTotal;
		this.transacaoItem = transacaoItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<TransacaoProduto> getTransacaoItem() {
		return transacaoItem;
	}

	public void setTransacaoItem(List<TransacaoProduto> transacaoItem) {
		this.transacaoItem = transacaoItem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacao other = (Transacao) obj;
		return Objects.equals(id, other.id);
	}
}
	
	
