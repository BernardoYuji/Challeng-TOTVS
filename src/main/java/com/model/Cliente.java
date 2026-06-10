package com.model;

public class Cliente {
    private int idCliente;
    private String razaoSocial;
    private String cnpj;

    public Cliente() {}

    public Cliente(int idCliente, String razaoSocial, String cnpj) {
        this.idCliente = idCliente;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public int getIdCliente() { return idCliente; }
    public Cliente setIdCliente(int idCliente) { this.idCliente = idCliente; return this; }

    public String getRazaoSocial() { return razaoSocial; }
    public Cliente setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; return this; }

    public String getCnpj() { return cnpj; }
    public Cliente setCnpj(String cnpj) { this.cnpj = cnpj; return this; }
}