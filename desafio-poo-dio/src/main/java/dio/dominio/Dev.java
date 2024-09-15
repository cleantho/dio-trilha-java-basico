package dio.dominio;

import java.util.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    private String nome;

    @EqualsAndHashCode.Exclude
    private Set<Modulo> modulosInscritos = new LinkedHashSet<>();

    @EqualsAndHashCode.Exclude
    private Set<Modulo> modulosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.modulosInscritos.addAll(bootcamp.getModulos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Modulo> conteudo = this.modulosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.modulosConcluidos.add(conteudo.get());
            this.modulosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        Iterator<Modulo> iterator = this.modulosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /*
         * return this.conteudosConcluidos
         * .stream()
         * .mapToDouble(Conteudo::calcularXp)
         * .sum();
         */
    }
    
    public void imprimirModulosInscritos(){
        System.out.println("Módulos Inscritos "+ nome + ":" + getModulosInscritos());
    }
    
    public void imprimirModulosConcluidos(){
        System.out.println("Módulos Concluídos "+ nome + ":" + getModulosConcluidos());
    }

}
