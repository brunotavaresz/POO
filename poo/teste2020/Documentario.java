package teste2020;

public class Documentario {

    private int ano;
    private String titulo;
    private int duracao;

    public Documentario(int ano, String titulo, int duracao) {
        this.ano = ano;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Documentario [ano=" + ano + ", duracao=" + duracao + ", titulo=" + titulo + "]";
    }
    
}
