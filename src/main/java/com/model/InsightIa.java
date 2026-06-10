package com.model;

public class InsightIa {
    private int idInsight;
    private String categoria; // TP_INA_CATEGORIA
    private String detalhe;   // DS_INA_DETALHE
    private double budget;    // VL_INA_BUDGET
    private Reuniao reuniao;  // FK para Reuniao
    private Produto produto;  // FK para Produto (pode ser nulo no banco)

    public InsightIa() {}

    public int getIdInsight() { return idInsight; }
    public InsightIa setIdInsight(int idInsight) { this.idInsight = idInsight; return this; }

    public String getCategoria() { return categoria; }
    public InsightIa setCategoria(String categoria) { this.categoria = categoria; return this; }

    public String getDetalhe() { return detalhe; }
    public InsightIa setDetalhe(String detalhe) { this.detalhe = detalhe; return this; }

    public double getBudget() { return budget; }
    public InsightIa setBudget(double budget) { this.budget = budget; return this; }

    public Reuniao getReuniao() { return reuniao; }
    public InsightIa setReuniao(Reuniao reuniao) { this.reuniao = reuniao; return this; }

    public Produto getProduto() { return produto; }
    public InsightIa setProduto(Produto produto) { this.produto = produto; return this; }
}