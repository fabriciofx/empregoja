package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Vaga implements Serializable {
        private static final long serialVersionUID = 1L;
	
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