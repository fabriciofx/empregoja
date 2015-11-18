package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cpf;
    private String celular;
    
    @Embedded
    private Endereco endereco;
    
    @Embedded
    private Usuario usuario;
    
    @OneToMany
    private List<Competencia> competencias;
    @OneToMany
    private List<Experiencia> experiencias;

    public Candidato(String nome, String cpf, String celular, Endereco endereco, Usuario usuario, List<Competencia> competencias,
            List<Experiencia> experiencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.endereco = endereco;
        this.usuario = usuario;
        this.competencias = competencias;
        this.experiencias = experiencias;
    }

    // Apenas pro CDI/JPA
    public Candidato() {
        endereco = new Endereco();
        usuario = new Usuario();
        competencias = new ArrayList<>();
        experiencias = new ArrayList<>();
    }

    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCaracteristica(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }
    
    public void adicionarCompetencias(Competencia competencia){
        if(competencia == null){
            return;
        }
        competencias.add(competencia);
    }
    
    public void adicionarExperiencias(Experiencia experiencia){
        if(experiencia == null){
            return;
        }
        experiencias.add(experiencia);
    }
}