package dio;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco do Brasil");
        Cliente cliente1 = new Cliente("Cleantho");
        Cliente cliente2 = new Cliente("Maria");

        Conta cc = new ContaCorrente(cliente1, banco);
        Conta poupanca = new ContaPoupanca(cliente1, banco);

        Conta cc2 = new ContaCorrente(cliente2, banco);

        banco.imprimirContas();
        banco.imprimirClientes();

        cc.depositar(100);
        cc2.depositar(300);

        try {
            cc.transferir(120, poupanca); // não permiti conta negativa
        } catch (TransacaoException e) {
            System.err.println("Transação não realizada:");
            System.err.println(e.getMessage());
        }

        cc.transferir(80, poupanca);
        cc2.transferir(120, cc);

        cc.imprimirSaldo();
        poupanca.imprimirSaldo();
        cc2.imprimirSaldo();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}
