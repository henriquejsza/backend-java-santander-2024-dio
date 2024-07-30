import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements Conta {
    private String numero;
    private double saldo;
    private double limite;
    private List<String> historico;

    public ContaCorrente(String numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.historico = new ArrayList<>();
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        historico.add("Depósito: R$" + valor);
        System.out.println("Depósito realizado com sucesso no valor de R$" + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            historico.add("Saque: R$" + valor);
            System.out.println("Saque realizado com sucesso no valor de R$" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo + limite) {
            sacar(valor);
            contaDestino.depositar(valor);
            historico.add("Transferência para a conta " + contaDestino.getNumero() + ": R$" + valor);
            System.out.println("Transferência realizada com sucesso no valor de R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }

    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }

    @Override
    public List<String> getHistoricoOperacoes() {
        return historico;
    }

    @Override
    public String extratoConta() {
        StringBuilder extrato = new StringBuilder();
        extrato.append("Conta Corrente\n");
        extrato.append("Número: ").append(numero).append("\n");
        extrato.append("Saldo: R$").append(saldo).append("\n");
        extrato.append("Histórico de Operações:\n");
        for (String operacao : historico) {
            extrato.append(operacao).append("\n");
        }
        return extrato.toString();
    }
}
