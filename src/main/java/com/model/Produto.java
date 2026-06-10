package com.model;

public class Produto {
    private int idProduto;
    private String nome;

    public Produto() {}

    public Produto(int idProduto, String nome) {
        this.idProduto = idProduto;
        this.nome = nome;
    }

    public int getIdProduto() { return idProduto; }
    public Produto setIdProduto(int idProduto) { this.idProduto = idProduto; return this; }

    public String getNome() { return nome; }
    public Produto setNome(String nome) { this.nome = nome; return this; }
}