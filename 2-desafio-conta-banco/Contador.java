import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe principal para executar a contagem de números entre dois parâmetros.
 */
public class Contador {
    private static final Logger logger = Logger.getLogger(Contador.class.getName());

    public static void main(String[] args) {
        // Inicializa o Scanner para leitura da entrada do usuário
        try (Scanner terminal = new Scanner(System.in)) {
            // Obtém os parâmetros do usuário com mensagens claras
            int parametroUm = InputUtils.obterParametro(terminal, "Digite o primeiro parâmetro");
            int parametroDois = InputUtils.obterParametro(terminal, "Digite o segundo parâmetro");
            
            // Chama o método contar que pode lançar uma exceção
            CounterUtils.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Exibe a mensagem de erro caso os parâmetros sejam inválidos
            System.out.println(e.getMessage());
            logger.log(Level.SEVERE, "Erro: " + e.getMessage(), e);
        } catch (Exception e) {
            // Captura e loga qualquer outra exceção inesperada
            System.out.println("Ocorreu um erro inesperado. Tente novamente.");
            logger.log(Level.SEVERE, "Erro inesperado: " + e.getMessage(), e);
        }
    }
}
