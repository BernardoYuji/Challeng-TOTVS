package com.service;
import com.model.InsightIa;

// Superclasse que define a regra geral (Herança)
public class FormatadorInsightService {
    public void imprimirPainel(InsightIa insight) {
        System.out.println(">>> INSIGHT GERADO PELA IA <<<");
        System.out.println("Detalhe: " + insight.getDetalhe());
    }
}