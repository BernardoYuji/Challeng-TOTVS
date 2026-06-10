package test;

import com.model.*;
import com.service.AnalizadorService;
import com.service.FormatadorInsightService;
import com.service.FormatadorAvancadoService;
import java.time.LocalDate;
import java.util.Scanner;

public class MainTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnalizadorService coreIa = new AnalizadorService();

        // Polimorfismo aplicado aqui (Instanciando a filha na referência da mãe)
        FormatadorInsightService impressora = new FormatadorAvancadoService();

        System.out.println("====================================================");
        System.out.println("  INICIANDO MOTOR DE IA CONVERSACIONAL - TOTVS CS   ");
        System.out.println("====================================================\n");

        // Instanciando as entidades base conforme as regras do modelo do banco de dados
        Cliente clienteTotvs = new Cliente()
                .setIdCliente(10)
                .setRazaoSocial("Alfa Transportes LTDA")
                .setCnpj("12.345.678/0001-99");

        Interlocutor participante = new Interlocutor()
                .setIdInterlocutor(11)
                .setNome("Nome Aleatorio")
                .setCargo("Diretor Comercial")
                .setEmail("nome.aleatorio@totvs.com.br")
                .setCliente(clienteTotvs);

        System.out.println("Contexto de Cliente cadastrado: " + clienteTotvs.getRazaoSocial());
        System.out.println("Interlocutor mapeado na chamada: " + participante.getNome());
        System.out.println("----------------------------------------------------\n");

        // Escolha dinâmica de produto por digitação no Scanner
        System.out.println("Qual produto da TOTVS está sendo avaliado nessa reunião? (Ex: Protheus, CRM, Fluig, RM)");
        System.out.print("Produto: ");
        String nomeProdutoDigitado = scanner.nextLine();

        // Cria o produto dinamicamente com o que você escolheu digitar
        Produto produtoNegociado = new Produto(501, "TOTVS " + nomeProdutoDigitado);

        System.out.println("\nInsira o texto bruto da TRANSCRIÇÃO da reunião:");
        System.out.print("> ");
        String transcricaoInput = scanner.nextLine();

        // Instanciando a Reunião com os dados informados
        Reuniao reuniao = new Reuniao()
                .setIdReuniao(777)
                .setData(LocalDate.now())
                .setInterlocutor(participante)
                .setTranscricao(transcricaoInput);

        // Executando a lógica real do sistema
        String sentimento = coreIa.identificarSentimento(transcricaoInput);
        reuniao.setSentimento(sentimento);

        InsightIa insightGerado = coreIa.extrairDadosDaTranscricao(reuniao, produtoNegociado);

        // Exibição polimórfica dos relatórios processados
        System.out.println("\nAnálise de Sentimento Concluída: [" + reuniao.getSentiment() + "]");
        impressora.imprimirPainel(insightGerado);

        scanner.close();
    }
}