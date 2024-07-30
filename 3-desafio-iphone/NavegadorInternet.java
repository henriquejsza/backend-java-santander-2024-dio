/**
 * Interface que define as operações básicas de um Navegador de Internet.
 */
public interface NavegadorInternet {
    void exibirPagina(String url) throws IllegalArgumentException;
    void adicionarNovaAba();
    void atualizarPagina();
    String getPaginaAtual(); // Método para obter a página atual
}
