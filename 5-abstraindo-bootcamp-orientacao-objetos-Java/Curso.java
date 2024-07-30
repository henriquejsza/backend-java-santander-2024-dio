public class Curso extends Entidade {
    private String descricao;
    private int cargaHoraria;

    public Curso(String nome, String descricao, int cargaHoraria) {
        super(nome);
        this.descricao = descricao;
        setCargaHoraria(cargaHoraria);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            throw new IllegalArgumentException("Carga horária deve ser positiva.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%d horas): %s", getNome(), cargaHoraria, descricao);
    }
}
