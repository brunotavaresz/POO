package testepratico;

public class Client {

    ClientType type;
    private int numerocontribuinte;
    private String nome;

    public Client(int numerocontribuinte, String nome, ClientType type) {
        this.numerocontribuinte = numerocontribuinte;
        this.nome = nome;
        this.type = type;
    }


    public int getNumerocontribuinte() {
        return numerocontribuinte;
    }

    public String getNome() {
        return nome;
    }

    public ClientType getTipocliente() {
        return type;
    }

    @Override
    public String toString() {
        return "Client{" + "numerocontribuinte=" + numerocontribuinte + ", nome='" + nome + '\'' + ", tipocliente=" + type + '}';
    }

}
