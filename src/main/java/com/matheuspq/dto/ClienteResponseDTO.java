package com.matheuspq.dto;

public class ClienteResponseDTO {
	private Long id;
	private String nome;
	private int pontos;
	private double cashback;
	
	//Construtores
	
	public ClienteResponseDTO() {
		
	}
	
	public ClienteResponseDTO(Long id, String nome, int pontos, double cashback) {
		this.id = id;
		this.nome = nome;
		this.pontos = pontos;
		this.cashback = cashback;
	}
	
	//Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public double getCashback() {
		return cashback;
	}
	public void setCashback(double cashback) {
		this.cashback = cashback;
	}
	
}
