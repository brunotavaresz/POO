package aula08;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras implements Compra {
    private List<Item> itens = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        for (Item item : itens) {
            if (item.getProduto().getNome().equals(produto.getNome())) {
                item.adicionarQuantidade(quantidade);
                return;
            }
        }
        if (produto instanceof ProdutoComDesconto) {
            itens.add(new ItemComDesconto((ProdutoComDesconto) produto, quantidade));
        } else {
            itens.add(new Item(produto, quantidade));
        }
    }

    @Override
    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Item item : itens) {
            System.out.printf("- %s (preço: %.2f, quantidade: %d)\n", item.getProduto().getNome(), item.getPreco(), item.getQuantidade());
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPrecoTotal();
        }
        return total;
    }

    private class Item {
        private Produto produto;
        private int quantidade;

        public Item(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void adicionarQuantidade(int quantidade) {
            this.quantidade += quantidade;
        }

        public double getPreco() {
            return produto.getPreco() * quantidade;
        }

        public double getPrecoTotal() {
            return getPreco();
        }
    }

    private class ItemComDesconto extends Item {
        private double desconto;

        public ItemComDesconto(ProdutoComDesconto produto, int quantidade) {
            super(produto, quantidade);
            this.desconto = produto.getDesconto();
        }

        @Override
        public double getPreco() {
            return super.getPreco() - desconto;
        }

        @Override
        public double getPrecoTotal() {
            return getPreco();
        }
    }
}
