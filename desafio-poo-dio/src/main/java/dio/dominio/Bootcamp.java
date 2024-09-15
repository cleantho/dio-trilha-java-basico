package dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Bootcamp {

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String descricao;

    @Getter
    private final LocalDate dataInicial = LocalDate.now();

    @Getter
    @EqualsAndHashCode.Exclude
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private Set<Dev> devsInscritos = new HashSet<>();

    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private Set<Modulo> modulos = new LinkedHashSet<>();

}