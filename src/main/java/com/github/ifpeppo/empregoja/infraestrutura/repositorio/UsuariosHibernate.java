package com.github.ifpeppo.empregoja.infraestrutura.repositorio;

import com.github.ifpeppo.empregoja.dominio.Usuario;
import com.github.ifpeppo.empregoja.dominio.repositorio.Usuarios;
import java.util.List;
import java.util.Objects;
import javax.persistence.TypedQuery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonardoanselmo
 */
public class UsuariosHibernate extends RepositorioHibernate<Usuario, Integer> implements Usuarios {

    @Override
    public List<Usuario> porEmail(String email) {
       Objects.requireNonNull(email, "Email inválido");
       
       return manager.createQuery("FROM Usuario u WHERE u.email LIKE :email")
                .setParameter("email", "%" + email + "%").getResultList();
    }    
      
}

