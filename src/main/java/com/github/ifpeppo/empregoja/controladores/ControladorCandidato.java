/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Candidato;
import com.github.ifpeppo.empregoja.dominio.repositorio.Candidatos;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author everton
 */
@Named
@ViewScoped
public class ControladorCandidato {
    
    private static final long serialVersionUID = 1;
    
    @Inject
    private Candidatos candidatos;
    
    private Candidato candidato;
    private List<Candidato> todosCandidatos;
    
    public void consultar(){
        todosCandidatos = candidatos.todos();
    }
    
    public void novo(){
        candidato = new Candidato();
    }
    
    public String adicianar(){
        candidatos.adiciona(candidato);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Candidato cadastrado com sucesso!"));
        
        return "";
    }
    
    public void alterar(){
        candidatos.alterar(candidato);
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public List<Candidato> getTodosCandidatos() {
        return todosCandidatos;
    }
}
