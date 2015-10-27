package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conhecimento")
public class Conhecimento implements Serializable{
	
	@Id
	@GeneratedValue
	
	private long id;
	
	private String descricao;
	
	public Conhecimento(String descricao){
		this.descricao = descricao;
	}
	
	public Conhecimento(){		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}