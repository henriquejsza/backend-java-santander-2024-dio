import java.util.ArrayList;
import java.util.List;

public class Dev extends Entidade {
    private List<Curso> cursosConcluidos;

    public Dev(String nome) {
        super(nome);
        this.cursosConcluidos = new ArrayList<>();
    }

    public void concluirCurso(Curso curso) {
        if (!cursosConcluidos.contains(curso)) {
            cursosConcluidos.add(curso);
        } else {
            System.out.println("Curso já concluído.");
        }
    }

    public List<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    @Override
    public String toString() {
        return String.format("%s - Cursos Concluídos: %s", getNome(), cursosConcluidos);
    }
}
