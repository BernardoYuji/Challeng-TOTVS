# Sistema em Java para o Sprin 1 e 2 Challenge TOTVS

Este projeto é uma solução em Java desenvolvida para processar transcrições brutas de áudios de reuniões da TOTVS, utilizando lógica analítica para extrair insights automáticos (oportunidades de Upsell ou alertas de Churn), identificar o sentimento do cliente e associar os produtos do ecossistema.

##  Como Executar o Sistema

1. Abra o projeto no **IntelliJ IDEA** (certifique-se de que o projeto foi importado como um projeto Maven).
2. Navegue até a pasta de testes verde: `src/test/java/test/`.
3. Escolha uma das duas classes de teste (`MainTest.java` ou `MainTest2.java`) para rodar.
4. Clique no ícone de **Seta Verde (Play)** ao lado do nome da classe para iniciar o programa.
5. Interaja com o sistema copiando e colando os gatilhos abaixo diretamente no console (terminal) do IntelliJ.

---

##  Cenários de Teste

###  1. Executando o `MainTest` (Produto Fixo: Protheus)

O `MainTest` já vem com o produto configurado como fixo na memória. Quando o sistema solicitar a transcrição, utilize um dos gatilhos abaixo:

#### **Gatilho Positivo (Oportunidade Comercial):**
> Olá, tudo bem? Nós estamos expandindo a nossa operação logística e temos muito interesse em comprar e testar o sistema Protheus neste trimestre. O nosso budget para investimentos já está aprovado pela diretoria

#### **Gatilho Negativo (Risco de Cancelamento):**
> A reunião de hoje é para reportar que estamos enfrentando um problema muito ruim com a plataforma. Está gerando um erro crítico na nossa operação diária e, se continuar assim, vamos acabar cancelando o nosso contrato com a TOTVS.

---

###  2. Executando o `MainTest2` (Produto Escolhido Dinamicamente)

O `MainTest2` é interativo e primeiro solicita que você **digite o nome de um produto** (Ex: *CRM*, *Fluig*, *RM*, *Protheus*). Logo em seguida, ele solicita a transcrição da reunião.

#### **Gatilho Positivo (Oportunidade Comercial):**
* **Ao digitar o Produto:** Digite o produto que preferir (Ex: `Fluig` ou `CRM`)
* **Ao colar a Transcrição:**
> Boa tarde. A nossa reunião de hoje é para alinhar a expansão das nossas filiais. Nós temos muito interesse em testar e comprar uma nova solução para a nossa equipe este mês. O nosso diretor já aprovou o budget interno para fazermos essa aquisição com a TOTVS o quanto antes, pois o cenário atual é excelente e tem ajudado bastante nossa operação.

#### **Gatilho Negativo (Risco de Cancelamento):**
* **Ao digitar o Produto:** Digite o produto que deseja simular a reclamação (Ex: `RM`)
* **Ao colar a Transcrição:**
> Olá, marcamos esse alinhamento porque a plataforma está apresentando um erro muito crítico na nossa triagem diária. Esse problema ruim está gerando muita demora e impactando diretamente as vendas. Do jeito que está difícil trabalhar com o sistema atual, a nossa diretoria está muito insatisfeita e cogitando seriamente cancelar o contrato.

---

##  Recursos OO Avaliados e Atendidos

* **Estrutura e Organização:** Separação limpa em pacotes `com.model`, `com.service` e `test`.
* **Atributos de Referência (Associações):** Entidades conectadas espelhando as chaves estrangeiras (FK) do banco de dados relacional.
* **Herança e Polimorfismo:** Implementado na camada de formatação e exibição dos painéis analíticos de forma dinâmica.
* **Entrada Dinâmica interativa:** Uso do `java.util.Scanner` atendendo aos critérios estritos de avaliação de testes da disciplina.


##  Tecnologias e Recursos Utilizados

* **Java SE** (Lógica base do sistema).
* **Padrão Fluído (Method Chaining)** nos getters e setters das entidades do modelo.
* **Programação Orientada a Objetos:** Associações complexas que refletem fielmente o Modelo Lógico Relacional (DER).
* **Herança e Polimorfismo:** Implementados na camada de serviços para a formatação e exibição inteligente dos relatórios gerados.
* **Entrada Dinâmica:** Utilização da classe `java.util.Scanner` para interação em tempo real.
