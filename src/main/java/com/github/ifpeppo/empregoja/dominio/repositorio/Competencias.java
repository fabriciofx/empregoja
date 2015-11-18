/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio.repositorio;

import com.github.ifpeppo.empregoja.dominio.Competencia;

/**
 *
 * @author everton
 */
public interface Competencias extends Repositorio<Competencia, Integer>{

    public void alterar(Competencia competencia);
}