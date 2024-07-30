import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criar Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java");

        // Criar Cursos
        Curso cursoJava = new Curso("Curso Java", "Aprenda Java do zero ao avançado", 80);
        Curso cursoPython = new Curso("Curso Python", "Introdução ao Python", 40);
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", LocalDate.of(2024, 8, 1));

        // Adicionar cursos e mentorias ao bootcamp
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoPython);
        bootcamp.adicionarMentoria(mentoriaJava);

        // Criar e adicionar Devs
        Dev dev1 = new Dev("Alice");
        Dev dev2 = new Dev("Bob");
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        // Concluir cursos
        dev1.concluirCurso(cursoJava);
        dev2.concluirCurso(cursoPython);

        // Exibir dados
        System.out.println("\n=== Dados do Bootcamp ===");
        System.out.println(bootcamp);

        System.out.println("\n=== Devs ===");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println(dev);
        }
    }
}
