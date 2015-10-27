package com.github.ifpeppo.empregoja.dominio.repositorio;

import java.util.List;

import com.github.ifpeppo.empregoja.dominio.Conhecimento;

public interface Conhecimentos extends Repositorio<Conhecimento, Integer> {

    public List<Conhecimento> porDescricao(String descricao);

    public void alterar(Conhecimento conhecimento);

}
