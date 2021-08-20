import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(10);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */
        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java Developer");
        bootCamp.setDescricao("Descricao BootCamp Java Developper");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootCamp(bootCamp);
        System.out.println("Conteudos Incritos Camila" + devCamila.getConteudosIncritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("===Após progredir===");
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP da Camila : " + devCamila.calcularTotalXp());

        System.out.println("*******************************");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootCamp(bootCamp);
        System.out.println("Conteudos Incritos Joao" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("===Após progredir===");

        System.out.println("Conteudos Concluidos Joao" + devCamila.getConteudosConcluidos());
        System.out.println("XP Joao: " + devCamila.calcularTotalXp());



    }
}