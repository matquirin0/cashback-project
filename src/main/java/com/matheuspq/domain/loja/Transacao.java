package com.matheuspq.domain.loja;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

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
	private LocalDateTime data;
	private double valor;
	private int pontosGerado;
	private double cashbackGerado;
	private int pontosUtilizado;
	
	public Transacao() {
		
	}

	public Transacao(Long id, LocalDateTime data, double valor, int pontosGerado, double cashbackGerado, int pontosUtilizado) {
		super();
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.pontosGerado = pontosGerado;
		this.cashbackGerado = cashbackGerado;
		this.pontosUtilizado = pontosUtilizado;
	}
	
	public void prePersist() {
		this.data = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getPontosGerado() {
		return pontosGerado;
	}

	public void setPontosGerado(int pontosGerado) {
		this.pontosGerado = pontosGerado;
	}

	public double getCashbackGerado() {
		return cashbackGerado;
	}

	public void setCashbackGerado(double cashbackGerado) {
		this.cashbackGerado = cashbackGerado;
	}

	public int getPontosUtilizado() {
		return pontosUtilizado;
	}

	public void setPontosUtilizado(int pontosUtilizado) {
		this.pontosUtilizado = pontosUtilizado;
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
