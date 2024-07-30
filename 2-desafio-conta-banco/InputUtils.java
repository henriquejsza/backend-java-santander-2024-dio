import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe utilitária para operações de entrada.
 */
public class InputUtils {
    private static final Logger logger = Logger.getLogger(InputUtils.class.getName());

    /**
     * Método para obter um parâmetro inteiro do usuário.
     * @param scanner Scanner para leitura da entrada do usuário.
     * @param mensagem Mensagem a ser exibida ao usuário.
     * @return O número inteiro inserido pelo usuário.
     */
    public static int obterParametro(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                logger.log(Level.WARNING, "Tentativa de entrada inválida: " + e.getMessage(), e);
            }
        }
    }
}
