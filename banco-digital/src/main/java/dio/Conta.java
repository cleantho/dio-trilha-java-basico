package dio;

import java.util.List;
import java.util.ArrayList;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1676;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
        this.banco = banco;
        this.transacoes = new ArrayList<Transacao>();
        this.banco.addConta(this);
    }

    @Override
    public void sacar(double valor) throws TransacaoException {
        if (saldo >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao(valor, "D"));
        } else {
            throw new TransacaoException("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        transacoes.add(new Transacao(valor, "C"));
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) throws TransacaoException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirSimples(String legenda) {
        System.out.println("============================");
        System.out.println(String.format("      %s", this.banco.getNome()));
        System.out.println(String.format("    Saldo %s ", legenda));
        System.out.println();
        System.out.println(String.format("   Agência: %d", this.agencia));
        System.out.println(String.format("   Conta: %d", this.numero));
        System.out.println(String.format("   Titular: %s", this.cliente.getNome()));
        System.out.println("----------------------------");
        System.out.println(String.format(" Saldo: %.2f", this.saldo));
        System.out.println("============================");
    }

    protected void imprimirDetalhado(String legenda) {
        System.out.println("============================");
        System.out.println(String.format("      %s", this.banco.getNome()));
        System.out.println(String.format("   Extrato %s ", legenda));
        System.out.println();
        System.out.println(String.format("   Agência: %d", this.agencia));
        System.out.println(String.format("   Conta: %d", this.numero));
        System.out.println(String.format("   Titular: %s", this.cliente.getNome()));
        System.out.println("----------------------------");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.toString());
        }
        System.out.println(String.format("Saldo:  %.2f", this.saldo));
        System.out.println("============================");
    }
}
