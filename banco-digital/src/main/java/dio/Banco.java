package dio;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {

    private String nome;
    private List<Conta> contas;
    private Set<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<Conta>();
        clientes = new HashSet<Cliente>();
    }

    public boolean addConta(Conta conta) {
        clientes.add(conta.getCliente());
        return contas.add(conta);
    }

    public boolean removeConta(Conta conta) {
        if (!contas.isEmpty()) {
            if (contas.contains(conta)) {
                return contas.remove(conta);
            }
        }
        return false;
    }

    public void imprimirContas() {
        System.out.println("====================================");
        System.out.println(" Lista de Contas do " + this.nome);
        System.out.println("------------------------------------");
        for (Conta conta : contas) {
            System.out.println(" Conta: " + conta.getNumero() + " da Agência: " + conta.getAgencia());
        }
        System.out.println("====================================");
    }

    public void imprimirClientes() {
        System.out.println("====================================");
        System.out.println(" Clientes do " + this.nome);
        System.out.println("------------------------------------");
        int i = 1;
        for (Cliente cliente : clientes) {
            System.out.println(i++ + ". " + cliente.getNome());
        }
        System.out.println("====================================");
    }
}
