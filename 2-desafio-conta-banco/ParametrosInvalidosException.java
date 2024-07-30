/**
 * Exceção personalizada para casos onde os parâmetros são inválidos.
 */
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
