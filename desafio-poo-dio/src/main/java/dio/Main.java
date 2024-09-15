package dio;

import dio.dominio.Bootcamp;
import dio.dominio.Curso;
import dio.dominio.Dev;
import dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Linguagem Java");
        curso1.setDescricao("Aprenda Programação Orientado a Objetos na linguagem mais popular do mercado.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Linguagem JavaScrip");
        curso2.setDescricao("A linguagem essencial no desenvolvimento Web.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tenha a melhor mentoria Java.");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Apreenda com a Dio no Bootcamp Java Developer.");
        bootcamp.getModulos().add(curso1);
        bootcamp.getModulos().add(curso2);
        bootcamp.getModulos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.imprimirModulosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("---------");
        devCamila.imprimirModulosInscritos();
        devCamila.imprimirModulosConcluidos();
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("=====================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.imprimirModulosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---------");
        devJoao.imprimirModulosInscritos();
        devJoao.imprimirModulosConcluidos();
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }

}