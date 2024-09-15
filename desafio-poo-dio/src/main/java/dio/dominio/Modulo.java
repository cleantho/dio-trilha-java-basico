package dio.dominio;

import lombok.Getter;
import lombok.Setter;

public abstract class Modulo {

    protected static final double XP_PADRAO = 10d;

    @Getter
    @Setter
    private String titulo;

    @Getter
    @Setter
    private String descricao;

    public abstract double calcularXp();

}
