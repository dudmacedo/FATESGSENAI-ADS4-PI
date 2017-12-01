package com.computadores.model;

import java.util.Date;

/**
 *
 * @author eduardo
 */
public class PessoaFisica extends Cliente {

    private Long cpf;
    private Integer rg;
    private String nome;
    private Date dtNasc;

    public PessoaFisica() {
        super(TipoPessoa.FISICA);
    }

    public PessoaFisica(int codigo) {
        super(codigo, TipoPessoa.FISICA);
    }

    @Override
    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s",
                (cpf == null) ? "null" : cpf,
                (rg == null) ? "null" : rg,
                (nome == null) ? "null" : nome,
                (dtNasc == null) ? "null" : dtNasc,
                (codigo == null) ? "null" : codigo,
                (tipo == null) ? "null" : tipo,
                (telresidencial == null) ? "null" : telresidencial,
                (telcomercial == null) ? "null" : telcomercial,
                (telcelular == null) ? "null" : telcelular,
                (email == null) ? "null" : email,
                (senha == null) ? "null" : senha,
                (enderecos == null) ? "null" : enderecos.size() + " endereços",
                (administrador) ? "Administrador" : "Cliente"
        );
    }
}
