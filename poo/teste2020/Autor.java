package teste2020;

public class Autor {

    private String nome;
    private int anoNascimento;

    public Autor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    @Override
    public String toString() {
        return "Autor [anoNascimento=" + anoNascimento + ", nome=" + nome + "]";
    }
    
}
