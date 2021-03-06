package com.computadores.model;

/**
 *
 * @author eduardo
 */
public class Categoria implements IEntidade {

    private int codigo;
    private String nome;
    private Categoria pai;

    public Categoria() {

    }

    public Categoria(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Categoria getPai() {
        return pai;
    }

    public void setPai(Categoria pai) {
        this.pai = pai;
    }
}
