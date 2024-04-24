import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        boolean criarNovaConta = true;

        while (criarNovaConta) {
            String agencia = "";
            int numero = 0;
            String nomeCliente = "";
            double saldo = 0;

            boolean agenciaValida = false;
            boolean numeroContaValido = false;
            boolean saldoValido = false;

            while (!agenciaValida) {
                System.out.println("Digite o número da Agência (exemplo: 067-8):");
                agencia = scanner.nextLine();
                if (agencia.matches("\\d{3}-\\d")) {
                    agenciaValida = true;
                } else {
                    System.out.println("Número da Agência inválido. Por favor, insira no formato correto (exemplo: 067-8).");
                }
            }

            while (!numeroContaValido) {
                System.out.println("Digite o número da Conta (exemplo: 1021):");
                try {
                    numero = Integer.parseInt(scanner.nextLine());
                    numeroContaValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Número da Conta inválido. Por favor, insira um número válido.");
                }
            }

            System.out.println("Digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();

            while (!saldoValido) {
                System.out.println("Digite o saldo (exemplo: 237.48):");
                try {
                    saldo = Double.parseDouble(scanner.nextLine().replace(',', '.'));
                    saldoValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Saldo inválido. Por favor, insira um número válido.");
                }
            }

            Conta novaConta = new Conta(agencia, numero, nomeCliente, saldo);
            contas.add(novaConta);

            System.out.println("Conta criada com sucesso!");

            System.out.println("Deseja criar outra conta? (sim/não):");
            String resposta = scanner.nextLine();
            criarNovaConta = resposta.equalsIgnoreCase("sim");
        }

        System.out.println("Lista de Contas Criadas:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        scanner.close();
    }
}

class Conta {
    private String agencia;
    private int numero;
    private String nomeCliente;
    private double saldo;

    public Conta(String agencia, int numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Agência: " + agencia + ", Conta: " + numero + ", Cliente: " + nomeCliente + ", Saldo: R$" + saldo;
    }
}
