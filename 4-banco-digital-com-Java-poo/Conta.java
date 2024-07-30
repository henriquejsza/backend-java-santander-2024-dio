import java.util.List;

public interface Conta {
    String getNumero();
    double getSaldo();
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta contaDestino);
    String getTipoConta();
    List<String> getHistoricoOperacoes();
    String extratoConta();
}
