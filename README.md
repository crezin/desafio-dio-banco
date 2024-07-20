Banco Digital em Java
Este projeto é uma implementação simples de um sistema bancário digital em Java, utilizando os princípios de Orientação a Objetos. O sistema oferece duas classes principais de contas: Conta Corrente e Conta Poupança, com funcionalidades básicas como depósito, saque e transferência entre contas.
Índice
Descrição do Projeto
Tecnologias Utilizadas
Estrutura do Projeto
Como Executar
Funcionalidades
Contribuições
Licença
Descrição do Projeto
O objetivo deste projeto é demonstrar a aplicação dos conceitos de Orientação a Objetos (OO) em Java, criando um sistema que simula operações bancárias comuns. O sistema é modular e permite fácil extensão e manutenção.
Tecnologias Utilizadas
Java: A linguagem de programação utilizada para implementar o sistema.
IDE: Qualquer IDE que suporte Java, como IntelliJ IDEA, Eclipse ou NetBeans.
Estrutura do Projeto
O projeto é organizado da seguinte forma:
text
BancoDigital/
├── src/
│   ├── Conta.java
│   ├── ContaCorrente.java
│   ├── ContaPoupanca.java
│   └── BancoDigital.java
└── README.md

Conta.java: Classe base que define as propriedades e métodos comuns a todas as contas.
ContaCorrente.java: Classe que representa uma conta corrente, estendendo a classe Conta.
ContaPoupanca.java: Classe que representa uma conta poupança, também estendendo a classe Conta.
BancoDigital.java: Classe principal que contém o método main para executar o sistema e testar suas funcionalidades.
