package DesafioDIOPOO;

import java.time.LocalDate;

public class  Main {

    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso javaa");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo M");
        devDanilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Danilo" + devDanilo.getConteudosInscritos());
        devDanilo.progredir();
        devDanilo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Danilo" + devDanilo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Danilo" + devDanilo.getConteudosConcluidos());
        System.out.println("XP: " + devDanilo.cacularTotalXP());

        System.out.println("--------------------");

        Dev devAnaClara = new Dev();
        devAnaClara.setNome("Ana clara");
        devAnaClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana Clara" + devAnaClara.getConteudosInscritos());
        devAnaClara.progredir();
        devAnaClara.progredir();
        devAnaClara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana Clara" + devAnaClara.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ana Clara" + devAnaClara.getConteudosConcluidos());
        System.out.println("XP: " + devAnaClara.cacularTotalXP());




    }
}
