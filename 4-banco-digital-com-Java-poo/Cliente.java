import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private String nome;
    private Map<String, Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public void exibirContas() {
        System.out.println("Contas do cliente " + nome + ":");
        for (Conta conta : contas.values()) {
            System.out.println(conta.getNumero() + " - " + conta.getTipoConta());
        }
    }
}
