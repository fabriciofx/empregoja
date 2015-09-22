package com.github.ifpeppo.empregoja.dominio;

public class Empresa {
	private String Nome;
	private String Cnpj;
	
	public Empresa(String nome, String cnpj){
		this.Nome = nome;
		this.Cnpj = cnpj;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
}