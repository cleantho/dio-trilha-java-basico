package dio.dominio;

import lombok.Getter;
import lombok.Setter;

public class Curso extends Modulo {

    @Getter
    @Setter
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso ==> " + getTitulo()
                + "   - " + getDescricao()
                + " Carga Horária: " + cargaHoraria;
    }
}
