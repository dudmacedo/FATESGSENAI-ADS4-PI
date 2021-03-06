package com.computadores.model;

/**
 *
 * @author eduardo
 */
public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private Long cnpj;
    private String inscricaoestadual;
    private Estado estadoemissor;

    public PessoaJuridica() {
        super(TipoPessoa.JURIDICA);
    }

    public PessoaJuridica(int codigo) {
        super(codigo, TipoPessoa.JURIDICA);
    }
    
    // Builder
    public static PessoaJuridica build() {
        return new PessoaJuridica();
    }
    
    public PessoaJuridica cnpj(long cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public PessoaJuridica inscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
        return this;
    }
    
    public PessoaJuridica estadoemissor(Estado estadoemissor) {
        this.estadoemissor = estadoemissor;
        return this;
    }
    // /Builder

    @Override
    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Long getCnpj() {
        return cnpj;
    }
    
    public String getCnpj_formatado() {
        String retorno = String.format("%014d",cnpj);
        return String.format(
                "%s.%s.%s/%s-%s",
                retorno.substring(0, 2),
                retorno.substring(2, 5),
                retorno.substring(5, 8),
                retorno.substring(8, 12),
                retorno.substring(12)
        );
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    public Estado getEstadoemissor() {
        return estadoemissor;
    }

    public void setEstadoemissor(Estado estadoemissor) {
        this.estadoemissor = estadoemissor;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s",
                (cnpj == null) ? "null" : cnpj,
                (inscricaoestadual == null) ? "null" : inscricaoestadual,
                (estadoemissor == null) ? "null" : estadoemissor.getNome(),
                (razaoSocial == null) ? "null" : razaoSocial,
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
