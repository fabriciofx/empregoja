/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Candidato;
import com.github.ifpeppo.empregoja.dominio.Competencia;
import com.github.ifpeppo.empregoja.dominio.Experiencia;
import com.github.ifpeppo.empregoja.dominio.repositorio.Candidatos;
import java.io.Serializable;
import java.util.ArrayList;
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
    private ControladorCompetencia controladorCompetencia;
    
    public void consultar(){
        todosCandidatos = candidatos.todos();
    }
    
    public void novo(){
        candidato = new Candidato();
        controladorCompetencia = new ControladorCompetencia();
    }
    
    public String adicionar(){
        Experiencia experiencias = new Experiencia(experienciasCandidato);  
        candidato.adicionarExperiencias(experiencias);
        adicionarCompetenciaCandidato();
        candidatos.adiciona(candidato);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Candidato cadastrado com sucesso!"));
        
        return "/candidato/apresentar";
    }
    
    public void adicionarCompetenciaCandidato(){
        List<Competencia> competencias = controladorCompetencia.getCompetenciasSelecionadas();
        candidato.adicionarCompetencias(competencias);
    }
    
    public List<Competencia> listaCompetenciasCandidato(){
        return candidato.getCompetencias();
    }
    
    public void alterar(){
        candidatos.alterar(candidato);
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public List<Candidato> getTodosCandidatos() {
        consultar();
        return todosCandidatos;
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

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public ControladorCompetencia getControladorCompetencia() {
        return controladorCompetencia;
    }

    public void setControladorCompetencia(ControladorCompetencia controladorCompetencia) {
        this.controladorCompetencia = controladorCompetencia;
    }
    
}