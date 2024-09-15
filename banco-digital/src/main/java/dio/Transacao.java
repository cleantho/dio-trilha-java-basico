package dio; 

import java.time.LocalDate;

public class Transacao {
    private LocalDate data;
    private double valor;
    private String tipo;

    public Transacao(double valor, String tipo) {
        data = LocalDate.now();
        this.valor = valor;
        this.tipo = tipo;
    }

    private String imprimirDataLocal() {
        return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear();
    }

    @Override
    public String toString() {
        return (imprimirDataLocal() + "  " + tipo + "  " + String.format("%.2f", valor));
    }
}
