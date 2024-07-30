# Projeto iPhone em Java

## Descrição

Este projeto simula um iPhone básico em Java com três funcionalidades principais:
- **Reprodutor Musical**
- **Aparelho Telefônico**
- **Navegador na Internet**

## Compilar e Executar

Para compilar e executar o projeto, siga estes passos:

1. **Navegue até o diretório onde os arquivos `.java` estão localizados.** Abra o terminal ou prompt de comando e use o comando:

    ```sh
    cd caminho/para/seu/diretório
    ```

2. **Compile todos os arquivos `.java` com o seguinte comando:**

    ```sh
    javac *.java
    ```

3. **Após a compilação, execute o programa com:**

    ```sh
    java Main
    ```

4. **Interaja com o menu do programa:**
    - Escolha a opção desejada para testar as funcionalidades ou exibir o histórico.

## Exemplos de Uso

- **Testar Reprodutor Musical:**
  - **Passo 1:** Digite o nome da música.
  - **Passo 2:** O programa exibirá a música selecionada, iniciará a reprodução e depois pausará a música.

- **Testar Aparelho Telefônico:**
  - **Passo 1:** Digite o número para ligar.
  - **Passo 2:** O programa simulará a chamada, atendimento e início do correio de voz.

- **Testar Navegador na Internet:**
  - **Passo 1:** Digite a URL da página para exibir.
  - **Passo 2:** O programa adicionará a página ao histórico, adicionará uma nova aba e atualizará a página.

- **Exibir Histórico:**
  - **Passo 1:** Selecione a opção para exibir o histórico.
  - **Passo 2:** O programa mostrará o histórico de músicas e páginas visitadas.

## Estrutura dos Arquivos

- **ReprodutorMusical.java:** Interface que define métodos para a funcionalidade de reprodutor musical.
- **AparelhoTelefonico.java:** Interface que define métodos para a funcionalidade de aparelho telefônico.
- **NavegadorInternet.java:** Interface que define métodos para a funcionalidade de navegador na internet.
- **IPhone.java:** Implementa as interfaces e gerencia as funcionalidades principais do iPhone.
- **Main.java:** Contém o menu principal e a lógica para interação com o usuário.

## Observações

- O projeto foi criado como parte de um desafio para modelar e diagramar um componente iPhone, abrangendo suas principais funcionalidades como reprodutor musical, aparelho telefônico e navegador na internet.
- Recomenda-se executar o código em um ambiente Java com suporte a console para garantir a melhor experiência interativa.
