/**
 * Interface que define as operações básicas de um Aparelho Telefônico.
 */
public interface AparelhoTelefonico {
    void ligar(String numero) throws IllegalArgumentException;
    void atender();
    void iniciarCorreioVoz();
    String getUltimoNumero(); // Método para obter o último número chamado
}
