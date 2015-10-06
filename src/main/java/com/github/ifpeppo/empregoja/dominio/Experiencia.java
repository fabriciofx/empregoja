/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio;

/**
 *
 * @author everton
 */
public class Experiencia {
    private String nomeEmpresa;
    private String cargo;

    public Experiencia(String nomeEmpresa, String cargo) {
        this.nomeEmpresa = nomeEmpresa;
        this.cargo = cargo;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}