package com.service;
import com.model.InsightIa;

// Subclasse herdando da classe base (Herança)
public class FormatadorAvancadoService extends FormatadorInsightService {

//  Relatório final da IA
    @Override // Sobrescrita de Método (Polimorfismo de Sobrescrita)
    public void imprimirPainel(InsightIa insight) {
        System.out.println("\n====================================================");
        System.out.println("          RELATÓRIO DE INTELIGÊNCIA DA IA           ");
        System.out.println("====================================================");
        System.out.println("CATEGORIA: " + insight.getCategoria().toUpperCase());
        System.out.println("DETALHE: " + insight.getDetalhe());
        if (insight.getBudget() > 0) {
            System.out.println("ORÇAMENTO ESTIMADO: R$ " + insight.getBudget());
        }
        if (insight.getProduto() != null) {
            System.out.println("PRODUTO TOTVS RELACIONADO: " + insight.getProduto().getNome());
        }
        System.out.println("====================================================\n");
    }
}