package com.github.ifpeppo.empregoja.dominio;

<<<<<<< HEAD
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jackson Carvalho
 */
@Entity
@Table(name = "empresa")

public class Empresa implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 205)
    private String nome;
    @Column(length = 205)
    private String cnpj;
    @Column(length = 205)
    private String estado;
    @Column(length = 205)
    private String cidade;
    @Column(length = 205)
    private String rua;
    @Column(length = 205)
    private String bairro;
    @Column(length = 205)
    private String numero;
    @Column(length = 100)
    private String email;
    @Column(length = 205)
    private String telefone;

    public Empresa(int id, String nome, String cnpj, String estado, String cidade, String rua, String bairro, String numero, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.email = email;
        this.telefone = telefone;
    }

    public Empresa(int id, String nome, String cnpj, String estado, String cidade, String rua, String bairro, String numero, String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
=======
public class Empresa {
    private String nome;
    private String cnpj;
    private Usuario usuario;

    public Empresa(String nome, String cnpj, Usuario usuario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.usuario = usuario;
>>>>>>> becaa2bd34cbf077d99d48d4e18133a90b3c8f94
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

<<<<<<< HEAD
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
=======
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
>>>>>>> becaa2bd34cbf077d99d48d4e18133a90b3c8f94
