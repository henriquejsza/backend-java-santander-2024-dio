# Desafio: Padrões de Projeto em Java

## Objetivo
Pratique o uso dos padrões de projeto Singleton, Strategy e Facade com um projeto Java. O objetivo é aprimorar habilidades em design de software e estruturação de código.

## Padrões de Projeto

- **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso.
- **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
- **Facade**: Fornece uma interface simplificada para um conjunto complexo de interfaces em um subsistema.

## Estrutura do Projeto

- **Singleton**
  - `Singleton.java`: Implementação do padrão Singleton.
  - `SingletonTest.java`: Testa a implementação do Singleton.

- **Strategy**
  - `Strategy.java`: Interface para o padrão Strategy.
  - `ConcreteStrategyA.java`: Implementação concreta da estratégia A.
  - `ConcreteStrategyB.java`: Implementação concreta da estratégia B.
  - `Context.java`: Utiliza a estratégia definida.
  - `StrategyTest.java`: Testa as implementações do Strategy.

- **Facade**
  - `SubsystemA.java`: Parte do subsistema.
  - `SubsystemB.java`: Outra parte do subsistema.
  - `Facade.java`: Interface simplificada para o subsistema.
  - `FacadeTest.java`: Testa a implementação do Facade.

## Execução

1. Compile e execute o código com sua IDE Java ou usando o terminal.
2. Teste cada padrão seguindo as instruções abaixo:

   **Singleton**
   ```bash
   cd src/singleton
   javac Singleton.java SingletonTest.java
   java SingletonTest
   cd src/strategy
   javac Strategy.java ConcreteStrategyA.java ConcreteStrategyB.java Context.java StrategyTest.java
   java StrategyTest
   cd src/facade
   javac SubsystemA.java SubsystemB.java Facade.java FacadeTest.java
   java FacadeTest

   ## Observações

- O projeto foi criado para praticar e demonstrar o uso dos padrões de projeto Singleton, Strategy e Facade em Java.
- É recomendado executar o código em um ambiente Java com suporte a console para garantir a melhor experiência interativa e testes eficazes.


