package test;

import com.model.Cliente;
import com.model.Interlocutor;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("- Iniciando Teste -\n");

        Cliente clienteTotvs = new Cliente()
                .setIdCliente(10)
                .setRazaoSocial("Totvs")
                .setCnpj("XX.XXX.XXX/XXXX-XX");


        Interlocutor participante = new Interlocutor()
                .setIdInterlocutor(11)
                .setNome("Bernardo Hanashiro")
                .setCargo("Diretor comercial")
                .setEmail("bernardo.hanashiro@totvs.com")
                .setCliente(clienteTotvs);


        System.out.println("Interlocutor cadastrado: " + participante.getNome());
        System.out.println("Empresa que ele representa: " + participante.getCliente().getRazaoSocial());
        System.out.println("CNPJ da Empresa: " + participante.getCliente().getCnpj());
    }
}