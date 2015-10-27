package com.github.ifpeppo.empregoja.dominio;

import javax.persistence.Embeddable;

@Embeddable
public class Vaga {
	private Empresa empresa;
	private String descricao;
	
	public Vaga(Empresa empresa, String descricao){
		this.empresa = empresa;
		this.descricao = descricao;
	}
	
	public Vaga(){
		
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescrisao(String descricao) {
		this.descricao = descricao;
	}
	
}