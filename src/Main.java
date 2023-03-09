import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do curso de Java");
        mentoria.setDescricao("Descrição da mentoria do curso Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição do BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devWilliam = new Dev();
        devWilliam.setNome("William");
        devWilliam.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos inscritos William: " + devWilliam.getConteudosIscritos());
        devWilliam.progredir();
        devWilliam.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos William: " + devWilliam.getConteudosIscritos());
        System.out.println("Conteúdos concluídos William: " + devWilliam.getConteudosConcluidos());
        System.out.println("XP: " + devWilliam.calcularTotalXp());

        System.out.println("..............");


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudosIscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudosIscritos());
        System.out.println("Conteúdos concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("............");
    }
}
