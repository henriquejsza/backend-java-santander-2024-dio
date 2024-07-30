import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um iPhone, implementando as funcionalidades de
 * Reprodutor Musical, Aparelho Telefônico e Navegador de Internet.
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String paginaAtual;
    private String ultimoNumero;

    // Lista para simular o histórico de músicas e páginas
    private List<String> historicoMusicas;
    private List<String> historicoPaginas;

    public IPhone() {
        this.musicaAtual = null;
        this.paginaAtual = null;
        this.ultimoNumero = null;
        this.historicoMusicas = new ArrayList<>();
        this.historicoPaginas = new ArrayList<>();
    }

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Música '" + musicaAtual + "' tocando.");
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Música '" + musicaAtual + "' pausada.");
        } else {
            System.out.println("Nenhuma música para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) throws IllegalArgumentException {
        if (musica == null || musica.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da música inválido. A música não foi selecionada.");
        }
        this.musicaAtual = musica;
        this.historicoMusicas.add(musica); // Adiciona ao histórico
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public String getMusicaAtual() {
        return musicaAtual;
    }

    @Override
    public void ligar(String numero) throws IllegalArgumentException {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Número de telefone inválido.");
        }
        this.ultimoNumero = numero;
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        if (ultimoNumero != null) {
            System.out.println("Atendendo chamada do número: " + ultimoNumero);
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public String getUltimoNumero() {
        return ultimoNumero;
    }

    @Override
    public void exibirPagina(String url) throws IllegalArgumentException {
        if (url == null || url.trim().isEmpty()) {
            throw new IllegalArgumentException("URL inválida.");
        }
        this.paginaAtual = url;
        this.historicoPaginas.add(url); // Adiciona ao histórico
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Página '" + paginaAtual + "' atualizada.");
        } else {
            System.out.println("Nenhuma página carregada para atualizar.");
        }
    }

    @Override
    public String getPaginaAtual() {
        return paginaAtual;
    }

    // Métodos para acessar o histórico
    public List<String> getHistoricoMusicas() {
        return historicoMusicas;
    }

    public List<String> getHistoricoPaginas() {
        return historicoPaginas;
    }
}
