# 🚀 Atividades de Lógica em Java

Este repositório contém dois exercícios práticos desenvolvidos em Java para exercitar conceitos fundamentais como estruturas condicionais, manipulação de variáveis e entrada de dados via terminal.

---

## 📁 Estrutura do Projeto

* **`projetoRenascimento.java`**: Um sistema simples de verificação de requisitos (coragem e saúde) para avançar em um desafio.
* **`alistamento.java`**: Um simulador que tria recrutas com base no peso informado.

---

## 🛠️ Detalhes dos Desafios

### 1. Projeto Renascimento
O programa avalia se o personagem possui os atributos necessários para o "renascimento".

* **Requisitos:** * `possuiCoragem` deve ser verdadeiro (`true`).
    * `saudeFisica` deve ser maior que 30.
* **Saída:** Exibe uma mensagem de sucesso caso os requisitos sejam atendidos ou uma mensagem de alerta caso contrário.

### 2. Alistamento Militar
Este programa interativo solicita o nome e o peso de um recruta para determinar sua categoria de aptidão física.

* **Categorias de Peso:**
    * **Abaixo do peso ideal:** Menos de 50kg.
    * **Peso ideal:** Entre 50kg e 100kg (inclusive).
    * **Acima do peso ideal:** Mais de 100kg.
* **Interatividade:** Utiliza a classe `Scanner` para ler dados diretamente do teclado.

---

## 🚀 Como Executar

1.  **Certifique-se de ter o Java instalado** (JDK 8 ou superior).
2.  **Compile os arquivos:**
    ```bash
    javac projetoRenascimento.java
    javac alistamento.java
    ```
3.  **Execute as classes:**
    ```bash
    java projetoRenascimento
    java alistamento
    ```

---

## 💻 Tecnologias Utilizadas
* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (Estrutural dentro do `main`)
