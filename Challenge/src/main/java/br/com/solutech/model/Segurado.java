package br.com.solutech.model;

import java.time.LocalDate;

public class Segurado {
	private int id;
	private String nome;
	private Object dataNascimento;
	private String rg;
	private String cpf;
	private String cep;
	private String logradouro;
	private String bairro;
	private String complemento;
	private String telefone;
	private String email;
	
	private Segurado() {}

	

	public Segurado(int id, String nome, Object dataNascimento, String rg, String cpf, String cep,
			String logradouro, String bairro, String complemento, String telefone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.complemento = complemento;
		this.telefone = telefone;
		this.email = email;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
