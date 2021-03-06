package com.computadores.model;

import java.util.List;

/**
 *
 * @author eduardo
 */
public class Estado {

    private int codigo;
    private String nome;
    private String sigla;
    private List<Cidade> cidades;
    
    public Estado() {
        
    }
    
    public Estado(int codigo) {
        this.codigo = codigo;
    }
    
    public Estado(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public Estado(int codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return nome;
    }

}
