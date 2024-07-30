import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe utilitária para operações de contagem.
 */
public class CounterUtils {
    private static final Logger logger = Logger.getLogger(CounterUtils.class.getName());

    /**
     * Método para contar e imprimir números de 1 até a diferença entre os parâmetros.
     * @param parametroUm O primeiro parâmetro, deve ser menor que o segundo.
     * @param parametroDois O segundo parâmetro, deve ser maior que o primeiro.
     * @throws ParametrosInvalidosException Se o primeiro parâmetro for maior ou igual ao segundo.
     */
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        logger.log(Level.INFO, "Contagem concluída com sucesso. Intervalo: " + contagem);
    }
}
