package com.github.ifpeppo.empregoja.dominio.repositorio;

import java.util.List;

public interface Repositorio<T, I> {

    public void adiciona(T objeto);
    
    public T procura(I id);

    public List<T> todos();
}
