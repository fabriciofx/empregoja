/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio.repositorio;

import com.github.ifpeppo.empregoja.dominio.Vaga;

/**
 *
 * @author Jackson Carvalho
 */
public interface Vagas extends Repositorio<Vaga, Integer>{
  public void alterar(Vaga vaga);   
}
