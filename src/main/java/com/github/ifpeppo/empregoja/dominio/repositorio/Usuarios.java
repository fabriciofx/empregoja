/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio.repositorio;


import com.github.ifpeppo.empregoja.dominio.Usuario;
import java.util.List;

/**
 *
 * @author leonardoanselmo
 */
public interface Usuarios extends Repositorio<Usuario, Integer>{
    
    public List<Usuario> porEmail(String email);    
    
    public void alterar(Usuario usuario);
    
}
