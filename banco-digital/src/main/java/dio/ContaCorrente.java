package dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirSaldo() {
        super.imprimirSimples("Conta Corrente");
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirDetalhado("Conta Corrente");
    }

}
