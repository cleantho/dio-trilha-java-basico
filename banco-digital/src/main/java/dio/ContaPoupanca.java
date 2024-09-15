package dio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirSaldo() {
        super.imprimirSimples("Conta Poupança");
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirDetalhado("Conta Poupança");
    }
}
