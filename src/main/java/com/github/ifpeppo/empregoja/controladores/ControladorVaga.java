/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Vaga;
import com.github.ifpeppo.empregoja.dominio.repositorio.Vagas;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Jackson Carvalho
 */
public class ControladorVaga implements Serializable {

    private static final long serialVersionUID = 1;

    @Inject
    private Vagas vagas;
    private Vaga vaga;
    private List<Vaga> todasVagas;

    public void consultar() {
        todasVagas = vagas.todos();
    }

    public void novo() {
        vaga = new Vaga();
    }

    public String adicionar() {
        vagas.adiciona(vaga);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A vaga foi cadastrada com sucesso!"));
        return "";
    }

    public void alterar() {
        vagas.alterar(vaga);
    }

    public Vagas getVagas() {
        return vagas;
    }

    public void setVagas(Vagas vagas) {
        this.vagas = vagas;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public List<Vaga> getTodasVagas() {
        return todasVagas;
    }

    public void setTodasVagas(List<Vaga> todasVagas) {
        this.todasVagas = todasVagas;
    }

}
