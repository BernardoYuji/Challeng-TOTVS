package com.service;
import com.model.*;

public class AnalizadorService {

    // Funcionalidade Real 1: Motor que gera inteligência dependendo do texto
    public InsightIa extrairDadosDaTranscricao(Reuniao reuniao, Produto produto) {
        String texto = reuniao.getTranscricao().toLowerCase();
        InsightIa insight = new InsightIa().setReuniao(reuniao);

        if (texto.contains("cancelar") || texto.contains("insatisfeito") || texto.contains("ruim") || texto.contains("difícil")) {
            insight.setIdInsight(101)
                    .setCategoria("Ameaça de Churn / Retenção")
                    .setProduto(produto)
                    .setDetalhe("Risco detectado: O cliente manifestou insatisfação operacional ou intenção de cancelamento.");
        } else if (texto.contains("comprar") || texto.contains("interesse") || texto.contains("mudar") || texto.contains("testar")) {
            insight.setIdInsight(202)
                    .setCategoria("Sinal de Upsell / Compra")
                    .setDetalhe("Oportunidade comercial detectada: Cliente tem interesse em adquirir ou expandir soluções TOTVS.")
                    .setProduto(produto)
                    .setBudget(55000.00);
        } else {
            insight.setIdInsight(303)
                    .setCategoria("Neutro")
                    .setDetalhe("Reunião de alinhamento e rotina padrão concluída sem gatilhos críticos.");
        }
        return insight;
    }

    // Funcionalidade Real 2: Classificador de Sentimento
    public String identificarSentimento(String transcricao) {
        String texto = transcricao.toLowerCase();
        if (texto.contains("excelente") || texto.contains("ótimo") || texto.contains("perfeito") || texto.contains("ajudou")) {
            return "Satisfeito";
        } else if (texto.contains("problema") || texto.contains("erro") || texto.contains("ruim") || texto.contains("defeito")) {
            return "Frustrado";
        }
        return "Misto";
    }
}