package test;

import com.model.*;
import com.service.AnalizadorService;
import com.service.FormatadorInsightService;
import com.service.FormatadorAvancadoService;
import java.time.LocalDate;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnalizadorService coreIa = new AnalizadorService();

        // POLIMORFISMO (Objeto da subclasse referenciado pela superclasse)
        FormatadorInsightService impressora = new FormatadorAvancadoService();

        System.out.println("====================================================");
        System.out.println("  INICIANDO MOTOR DE IA CONVERSACIONAL - TOTVS CS   ");
        System.out.println("====================================================\n");

        // 1. Criando o Cliente com a ID + Razão Social
        Cliente clienteTotvs = new Cliente()
                .setIdCliente(10)
                .setRazaoSocial("Alfa Transportes LTDA")
                .setCnpj("12.345.678/0001-99");

        // 2. Criando o Interlocutor associado ao cliente
        Interlocutor participante = new Interlocutor()
                .setIdInterlocutor(11)
                .setNome("Nome Aleatório")
                .setCargo("Diretor Comercial")
                .setEmail("nome.aleatorio@totvs.com.br")
                .setCliente(clienteTotvs);

        // 3. Criando o Produto do Catálogo
        Produto protheus = new Produto(501, "TOTVS ERP Protheus");

        System.out.println("Contexto do Cliente e Persona carregados com sucesso.");
        System.out.println("A analisar canal de atendimento com: " + participante.getNome());
        System.out.println("----------------------------------------------------\n");

        // Entrada dinâmica pelo Scanner
        System.out.println("Insira o texto bruto da TRANSCRIÇÃO da reunião:");
        System.out.print("> ");
        String transcricaoInput = scanner.nextLine();

        // 4. Instanciando a Reunião
        Reuniao reuniao = new Reuniao()
                .setIdReuniao(777)
                .setData(LocalDate.now())
                .setInterlocutor(participante)
                .setTranscricao(transcricaoInput);

        // Executando as funcionalidades do sistema
        String sentimento = coreIa.identificarSentimento(transcricaoInput);
        reuniao.setSentimento(sentimento);

        InsightIa insightGerado = coreIa.extrairDadosDaTranscricao(reuniao, protheus);

        // 5. Exibição final usando Polimorfismo
        System.out.println("\nAnálise de Sentimento Concluída: [" + reuniao.getSentiment() + "]");
        impressora.imprimirPainel(insightGerado); // Executa o método polimórfico

        scanner.close();
    }
}