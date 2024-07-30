/**
 * Interface que define as operações básicas de um Reprodutor Musical.
 */
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica) throws IllegalArgumentException;
    String getMusicaAtual(); // Método para obter a música atual
}
