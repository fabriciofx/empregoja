package com.github.ifpeppo.empregoja.dominio;

public class Vaga {
	private Empresa empresa;
	private String descrisao;
	
	public Vaga(Empresa empresa, String descrisao){
		this.empresa = empresa;
		this.descrisao = descrisao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getDescrisao() {
		return descrisao;
	}

	public void setDescrisao(String descrisao) {
		this.descrisao = descrisao;
	}
	
}