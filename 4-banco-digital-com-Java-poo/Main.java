import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("João da Silva");
        ContaCorrente contaCorrente = new ContaCorrente("001", 1000, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("002", 500, 0.02);

        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);
        banco.adicionarCliente(cliente);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Exibir Saldo");
            System.out.println("5. Exibir Histórico");
            System.out.println("6. Aplicar Juros (Conta Poupança)");
            System.out.println("7. Exibir Contas do Cliente");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    String numeroDeposito = scanner.next();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    Conta contaDeposito = cliente.buscarConta(numeroDeposito);
                    if (contaDeposito != null) {
                        contaDeposito.depositar(valorDeposito);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o número da conta: ");
                    String numeroSaque = scanner.next();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    Conta contaSaque = cliente.buscarConta(numeroSaque);
                    if (contaSaque != null) {
                        contaSaque.sacar(valorSaque);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da conta origem: ");
                    String numeroOrigem = scanner.next();
                    System.out.print("Digite o número da conta destino: ");
                    String numeroDestino = scanner.next();
                    System.out.print("Digite o valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    Conta contaOrigem = cliente.buscarConta(numeroOrigem);
                    Conta contaDestino = cliente.buscarConta(numeroDestino);
                    if (contaOrigem != null && contaDestino != null) {
                        System.out.print("Confirma a transferência de R$" + valorTransferencia + " para a conta " + numeroDestino + "? (s/n): ");
                        char confirmacao = scanner.next().charAt(0);
                        if (confirmacao == 's' || confirmacao == 'S') {
                            contaOrigem.transferir(valorTransferencia, contaDestino);
                        } else {
                            System.out.println("Transferência cancelada.");
                        }
                    } else {
                        System.out.println("Uma ou ambas as contas não foram encontradas.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    String numeroSaldo = scanner.next();
                    Conta contaSaldo = cliente.buscarConta(numeroSaldo);
                    if (contaSaldo != null) {
                        System.out.println("Saldo da conta " + numeroSaldo + ": R$" + contaSaldo.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o número da conta: ");
                    String numeroHistorico = scanner.next();
                    Conta contaHistorico = cliente.buscarConta(numeroHistorico);
                    if (contaHistorico != null) {
                        System.out.println(contaHistorico.extratoConta());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 6:
                    System.out.print("Digite o número da conta poupança: ");
                    String numeroPoupanca = scanner.next();
                    Conta contaPoupancaSelecionada = cliente.buscarConta(numeroPoupanca);
                    if (contaPoupancaSelecionada instanceof ContaPoupanca) {
                        ((ContaPoupanca) contaPoupancaSelecionada).aplicarJuros();
                    } else {
                        System.out.println("Conta não encontrada ou não é uma conta poupança.");
                    }
                    break;

                case 7:
                    cliente.exibirContas();
                    break;

                case 8:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}
