import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Inicialização do Scanner para captura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número da Agência
        System.out.println("Digite o número da Agência (exemplo: 067-8):");
        String agencia = scanner.nextLine(); // Captura o número da agência fornecido pelo usuário

        // Solicitação do número da Conta
        System.out.println("Digite o número da Conta (exemplo: 1021):");
        // Converte a entrada para int, já que o número da conta é um inteiro
        int numero = Integer.parseInt(scanner.nextLine()); // Captura o número da conta fornecido pelo usuário

        // Solicitação do nome do Cliente
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine(); // Captura o nome do cliente fornecido pelo usuário

        // Solicitação do saldo
        System.out.println("Digite o saldo (exemplo: 237.48):");
        // Substitui todas as vírgulas por pontos para garantir que o formato seja válido
        String saldoString = scanner.nextLine().replace(',', '.');
        // Converte a entrada para double, já que o saldo é um número decimal
        double saldo = Double.parseDouble(saldoString); // Captura o saldo fornecido pelo usuário

        // Construção da mensagem de saudação ao cliente, incluindo os dados fornecidos
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é R$%.2f já está disponível para saque.\n", nomeCliente, agencia, numero, saldo);

        // Fechamento do Scanner para liberar recursos
        scanner.close();
    }
}
