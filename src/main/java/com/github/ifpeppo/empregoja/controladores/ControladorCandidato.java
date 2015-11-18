/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Candidato;
import com.github.ifpeppo.empregoja.dominio.Competencias;
import com.github.ifpeppo.empregoja.dominio.Experiencia;
import com.github.ifpeppo.empregoja.dominio.repositorio.Candidatos;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author everton
 */
@Named
@ViewScoped
public class ControladorCandidato implements Serializable {
    
    private static final long serialVersionUID = 1;
    
    @Inject
    private Candidatos candidatos;
    
    private Candidato candidato;
    private List<Candidato> todosCandidatos;
    private String competenciasCandidato = null;
    private String experienciasCandidato = null;
    
    public void consultar(){
        todosCandidatos = candidatos.todos();
    }
    
    public void novo(){
        candidato = new Candidato();
    }
    
    public String adicionar(){
        Competencias competencias = new Competencias(competenciasCandidato);
        Experiencia experiencias = new Experiencia(experienciasCandidato);
        candidato.adicionarCompetencias(competencias);
        candidato.adicionarExperiencias(experiencias);
        candidatos.adiciona(candidato);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Candidato cadastrado com sucesso!"));
        
        return "/candidato/apresentar";
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
    
    public void detalhe(Candidato candidato){
        this.candidato = candidato;
    }

    public String getCompetenciasCandidato() {
        return competenciasCandidato;
    }

    public void setCompetenciasCandidato(String competenciasCandidato) {
        this.competenciasCandidato = competenciasCandidato;
    }

    public String getExperienciasCandidato() {
        return experienciasCandidato;
    }

    public void setExperienciasCandidato(String experienciasCandidato) {
        this.experienciasCandidato = experienciasCandidato;
    }  
}