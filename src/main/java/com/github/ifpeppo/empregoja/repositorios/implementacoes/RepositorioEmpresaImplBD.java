/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.repositorios.implementacoes;

import com.github.ifpeppo.empregoja.dao.DaoManagerHiber;
import com.github.ifpeppo.empregoja.dominio.Empresa;
import com.github.ifpeppo.empregoja.irepositorios.interfaces.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author Jackson Carvalho
 */
public class RepositorioEmpresaImplBD implements RepositorioGenerico<Empresa> {

    @Override
    public void inserir(Empresa t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Empresa t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Empresa recuperar(int id) {
        return (Empresa) DaoManagerHiber.getInstance().recover("from Empresa where codigo=" + id);
    }

    @Override
    public void excluir(Empresa t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Empresa> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Empresa");
    }

}
