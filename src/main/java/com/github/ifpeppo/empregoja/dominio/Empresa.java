package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jackson Carvalho
 */
@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cnpj;
    private String telefone;

    @Embedded
    private Endereco endereco;
    @Embedded
    private Usuario usuario;
       
    @OneToMany(cascade = CascadeType.ALL)
    private List<Vaga> vagas;
  
    public Empresa(long id, String nome,String cnpj, String telefone, Endereco endereco, Usuario usuario, List<Vaga> vagas) {
        this.id = id;
        this.nome = nome;
        this.cnpj=cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.usuario = usuario;
        this.vagas = vagas;
    }
   
    
    // Apenas pro CDI/JPA
    public Empresa() {
        endereco = new Endereco();
        usuario = new Usuario();
        vagas = new ArrayList<>();
    }
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
public void adicionarVaga(Vaga vaga){
        if(vagas == null){
            return;
        }
        vagas.add(vaga);
    }
    
}