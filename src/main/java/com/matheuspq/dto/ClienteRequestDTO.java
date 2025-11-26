package com.matheuspq.dto;

import jakarta.validation.constraints.NotNull;

public class ClienteRequestDTO {
	@NotNull
	private Long cpf;
	@NotNull
	private String nome;
	@NotNull
	private String email;
	@NotNull
	private String telefone;
	
	//Construtores
	
	public ClienteRequestDTO() {
			
	}
	
	public ClienteRequestDTO(Long cpf, String nome, String email, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	//Getters e Setters
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
