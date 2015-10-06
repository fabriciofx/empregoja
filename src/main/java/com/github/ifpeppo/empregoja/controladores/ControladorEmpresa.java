/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Empresa;
import com.github.ifpeppo.empregoja.irepositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jackson Carvalho
 */
@ManagedBean(name = "controleEmpresa")
@SessionScoped

public class ControladorEmpresa {

    private RepositorioGenerico<Empresa> repositorioEmpresa = null;
    private Empresa selectedEmpresa;

    public String inserirEmpresa(Empresa e) {
        this.repositorioEmpresa.inserir(e);

        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage("Parabéns", "A empresa " + e.getNome() + ""
                                + "foi cadastrada com sucesso!"));

        return "ApresentaEmpresa.xhtml";

    }

    public String alterarEmpresa(Empresa e) {

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Sucesso", "A empresa foi alterada com sucesso!!"));

        this.repositorioEmpresa.alterar(e);

        return "ApresentaEmpresa.xhtml";
    }

    public Empresa recuperaEmpresa(int id) {
        return this.repositorioEmpresa.recuperar(id);
    }

    public void deletarEmpresa(Empresa e) {
        this.repositorioEmpresa.excluir(e);
    }

    public List<Empresa> recuperarTodosEmpresa() {
        return this.repositorioEmpresa.recuperarTodos();
    }

    public RepositorioGenerico<Empresa> getRepositorioEmpresa() {
        return repositorioEmpresa;
    }

    public void setRepositorioEmpresa(RepositorioGenerico<Empresa> repositorioEmpresa) {
        this.repositorioEmpresa = repositorioEmpresa;
    }

    public Empresa getSelectedEmpresa() {
        return selectedEmpresa;
    }

    public void setSelectedEmpresa(Empresa selectedEmpresa) {
        this.selectedEmpresa = selectedEmpresa;
    }

}
