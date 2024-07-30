import java.time.LocalDate;

public class Mentoria extends Entidade {
    private LocalDate data;

    public Mentoria(String nome, LocalDate data) {
        super(nome);
        setData(data);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data.isAfter(LocalDate.now())) {
            this.data = data;
        } else {
            throw new IllegalArgumentException("Data deve ser no futuro.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getNome(), data);
    }
}
