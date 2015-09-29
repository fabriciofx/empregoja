package com.github.ifpeppo.empregoja.dominio;

public class Candidato {
	
	private String nome;
	private String email;
	private String cpf;
	private String celular;
	private String cidade;
	private String uf;
	private String senha;

	public Candidato(String nome, String email, String cpf, String celular,
			String cidade, String uf, String senha) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.celular = celular;
		this.cidade = cidade;
		this.uf = uf;
		this.senha = senha;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}	

}