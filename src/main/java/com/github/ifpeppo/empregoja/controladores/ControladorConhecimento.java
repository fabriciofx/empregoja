package com.github.ifpeppo.empregoja.controladores;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.github.ifpeppo.empregoja.dominio.Conhecimento;
import com.github.ifpeppo.empregoja.dominio.repositorio.Conhecimentos;

public class ControladorConhecimento {
	
	private static final long serialVersionUID = 1;
    
    @Inject
    private Conhecimentos conhecimentos;
    
    private Conhecimento conhecimento;
    private List<Conhecimento> todosConhecimentos;
    
    public void consultar(){
        todosConhecimentos = conhecimentos.todos();
    }
    
    public void novo(){
        conhecimento = new Conhecimento();
    }
    
    public String adicianar(){
        conhecimentos.adiciona(conhecimento);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Conhecimento cadastrado com sucesso!"));
        
        return "";
    }
    
    public void alterar(){
        conhecimentos.alterar(conhecimento);
    }

    public Conhecimento getConhecimento() {
        return conhecimento;
    }

    public List<Conhecimento> getTodosConhecimentos() {
        return todosConhecimentos;
    }
	

}
