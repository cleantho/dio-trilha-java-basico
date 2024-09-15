package dio.dominio;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class Mentoria extends Modulo {

    @Getter
    @Setter
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\nMentoria ==> " + getTitulo()
                + "   - " + getDescricao()
                + " Data: " + data;
    }
}
