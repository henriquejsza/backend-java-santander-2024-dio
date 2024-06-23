import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static class Conta {
        String agencia;
        int numero;
        String nomeCliente;
        double saldo;
        ArrayList<Double> historico; // Histórico de transações

        Conta(String agencia, int numero, String nomeCliente, double saldo) {
            this.agencia = agencia;
            this.numero = numero;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
            this.historico = new ArrayList<>();
        }

        void registrarTransacao(double valor) {
            historico.add(valor);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Acessar conta existente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    criarConta(scanner, contas);
                    break;
                case 2:
                    acessarConta(scanner, contas);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }

    static void criarConta(Scanner scanner, ArrayList<Conta> contas) {
        System.out.println("Criar Nova Conta");

        String agencia = validarAgencia(scanner);
        int numero = validarNumeroConta(scanner, contas);
        String nomeCliente = validarNomeCliente(scanner);
        double saldo = validarSaldo(scanner);

        Conta novaConta = new Conta(agencia, numero, nomeCliente, saldo);
        contas.add(novaConta);

        // Mensagem de confirmação de criação da conta
        System.out.println("Conta criada com sucesso!");

        // Formatação do saldo
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = nf.format(saldo);

        // Construção da mensagem de saudação ao cliente
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é %s já está disponível para saque.\n", nomeCliente, agencia, numero, saldoFormatado);

        // Linha de separação
        System.out.println("--------------------------");

        // Mensagem padrão
        System.out.println("Olá, bem-vindo ao banco!");
    }

    static String validarAgencia(Scanner scanner) {
        System.out.println("Digite o número da Agência (exemplo: 067-8):");
        String agencia = scanner.nextLine();
        while (!agencia.matches("\\d{3}-\\d")) {
            System.out.println("Número da Agência inválido. Por favor, insira no formato correto (exemplo: 067-8):");
            agencia = scanner.nextLine();
        }
        return agencia;
    }

    static int validarNumeroConta(Scanner scanner, ArrayList<Conta> contas) {
        System.out.println("Digite o número da Conta (exemplo: 1021):");
        int numero = Integer.parseInt(scanner.nextLine());

        // Verificar se o número da conta já existe
        for (Conta conta : contas) {
            if (conta.numero == numero) {
                System.out.println("Uma conta com esse número já existe. Por favor, insira um número de conta diferente.");
                return validarNumeroConta(scanner, contas);
            }
        }

        return numero;
    }

    static String validarNomeCliente(Scanner scanner) {
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine().trim();
        while (nomeCliente.isEmpty()) {
            System.out.println("Nome do Cliente inválido. Por favor, insira um nome válido:");
            nomeCliente = scanner.nextLine().trim();
        }
        return nomeCliente;
    }

    static double validarSaldo(Scanner scanner) {
        System.out.println("Digite o saldo (exemplo: 237.48):");
        double saldo = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        while (saldo < 0) {
            System.out.println("Saldo inválido. O saldo não pode ser negativo:");
            saldo = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        }
        return saldo;
    }

    static void acessarConta(Scanner scanner, ArrayList<Conta> contas) {
        System.out.println("Acessar Conta Existente");

        // Validação do número da Conta
        System.out.println("Digite o número da Conta:");
        int numero = Integer.parseInt(scanner.nextLine());

        Conta contaExistente = null;
        for (Conta conta : contas) {
            if (conta.numero == numero) {
                contaExistente = conta;
                break;
            }
        }

        if (contaExistente == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Saque");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$%.2f\n", contaExistente.saldo);
                    break;
                case 2:
                    realizarSaque(scanner, contaExistente);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    static void realizarSaque(Scanner scanner, Conta conta) {
        System.out.println("Realizar Saque");

        // Validação do valor do saque
        System.out.println("Digite o valor do saque:");
        double valorSaque = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        if (valorSaque <= 0) {
            System.out.println("Valor inválido. O valor do saque deve ser maior que zero.");
            return;
        }

        if (valorSaque > conta.saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        conta.saldo -= valorSaque;
        conta.registrarTransacao(-valorSaque);
        System.out.printf("Saque de R$%.2f realizado com sucesso. Novo saldo: R$%.2f\n", valorSaque, conta.saldo);
    }
}

