package aula08;

public class ProdutoComDesconto implements Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double desconto;

    public ProdutoComDesconto(String nome, double preco, int quantidade, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double getDesconto() {
        return desconto;
    }
}