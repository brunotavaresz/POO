package teste2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Livro extends Produto  {
    public static final int IVA = 6;

    private String titulo;
    List<Autor> lista;
    private int stock;

    public Livro(String titulo, double precoSemImposto){
        super("L", precoSemImposto);
        this.titulo = titulo;
        this.lista = new ArrayList<>(); // Instantiate an empty ArrayList
    }

    public Livro(String titulo, double precoSemImposto, List<Autor> lista){
        super("L", precoSemImposto);
        this.titulo = titulo;
        this.lista = lista;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getLista() {
        return lista;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void add(Autor autor) {
        lista.add(autor);
    }


    public void addStock(int quantidade) {
        this.stock += quantidade;
    }

    public int numeroAutores() {
        return lista.size();
    }

    public String autores() {
        String s = "";
        for (Autor autor : lista) {
            s += autor.getNome() + ", ";
        }
        return s;
    }

    public int getStock() {
        return this.stock;
    }

    public boolean vender(int quantidade) {
        if (quantidade <= this.stock) {
            this.stock -= quantidade;
            return true;
        }
        return false;
    }

    @Override
    public double precoVendaAoPublico() {
        return this.getPrecoSemImposto()*(1+IVA/100);
    }

    @Override
    public String getDescricao() {
        return this.getTitulo();
        
    }



    
}
