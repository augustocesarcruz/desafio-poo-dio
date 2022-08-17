import br.com.desafio.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAugusto = new Dev();
        devAugusto.setNome("Augusto");
        devAugusto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Augusto" + devAugusto.getConteudosInscritos());
        devAugusto.progredir();
        devAugusto.progredir();
        devAugusto.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Augusto" + devAugusto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Augusto" + devAugusto.getConteudosConcluidos());
        System.out.println("XP:" + devAugusto.calcularTotalXp());

        System.out.println("--------");

        Dev devIza = new Dev();
        devIza.setNome("Iza");
        devIza.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Iza" + devIza.getConteudosInscritos());
        devIza.progredir();
        devIza.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Iza" + devIza.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Iza" + devIza.getConteudosConcluidos());
        System.out.println("XP:" + devIza.calcularTotalXp());
    }
}
