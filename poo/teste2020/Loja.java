package teste2020;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nome;
    private String email;
    List<Produto> produtos;

    public Loja(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public Produto getProdutoPelaDescricao(String descricao) {
        for (Produto p : produtos)
            if (p.getDescricao().equals(descricao))
                return p;
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int totalItems() {
        return produtos.size();
    }

    public void add(Produto produto) {
        produtos.add(produto);
    }
    
}
