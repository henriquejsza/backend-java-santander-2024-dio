import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal para testar as funcionalidades do iPhone.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IPhone iphone = new IPhone();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Testar Reprodutor Musical");
            System.out.println("2. Testar Aparelho Telefônico");
            System.out.println("3. Testar Navegador Internet");
            System.out.println("4. Exibir Histórico");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (opcao) {
                    case 1:
                        testarReprodutorMusical(scanner, iphone);
                        break;
                    case 2:
                        testarAparelhoTelefonico(scanner, iphone);
                        break;
                    case 3:
                        testarNavegadorInternet(scanner, iphone);
                        break;
                    case 4:
                        exibirHistorico(iphone);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }
    }

    private static void testarReprodutorMusical(Scanner scanner, IPhone iphone) {
        try {
            System.out.println("Teste do Reprodutor Musical:");
            System.out.print("Digite o nome da música: ");
            String musica = scanner.nextLine();
            iphone.selecionarMusica(musica);
            iphone.tocar();
            iphone.pausar();
            System.out.println("Música atual: " + iphone.getMusicaAtual());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void testarAparelhoTelefonico(Scanner scanner, IPhone iphone) {
        try {
            System.out.println("Teste do Aparelho Telefônico:");
            System.out.print("Digite o número para ligar: ");
            String numero = scanner.nextLine();
            iphone.ligar(numero);
            iphone.atender();
            iphone.iniciarCorreioVoz();
            System.out.println("Último número chamado: " + iphone.getUltimoNumero());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void testarNavegadorInternet(Scanner scanner, IPhone iphone) {
        try {
            System.out.println("Teste do Navegador Internet:");
            System.out.print("Digite o URL da página: ");
            String url = scanner.nextLine();
            iphone.exibirPagina(url);
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
            System.out.println("Página atual: " + iphone.getPaginaAtual());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void exibirHistorico(IPhone iphone) {
        System.out.println("Histórico de Músicas:");
        for (String musica : iphone.getHistoricoMusicas()) {
            System.out.println("- " + musica);
        }

        System.out.println("Histórico de Páginas:");
        for (String pagina : iphone.getHistoricoPaginas()) {
            System.out.println("- " + pagina);
        }
        System.out.println();
    }
}
