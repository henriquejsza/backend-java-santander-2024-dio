import java.util.ArrayList;
import java.util.List;

public class Bootcamp extends Entidade {
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Dev> devs;

    public Bootcamp(String nome) {
        super(nome);
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    @Override
    public String toString() {
        return String.format("Bootcamp: %s\nCursos: %s\nMentorias: %s\nDevs: %s",
                getNome(), cursos, mentorias, devs);
    }
}
