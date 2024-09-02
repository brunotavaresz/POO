package aula10;

import java.util.HashMap;
import java.util.Map;

public class GenerosLiterarios {
    private Map<String, Book> generos;

    public GenerosLiterarios() {
        generos = new HashMap<>();
    }

    public void addGeneros(String geneross, Book book) {
        generos.put(geneross, book);
    }

    public void alterarGeneros(String geneross, Book book) {
        generos.replace(geneross, book);
    }

    public void removerGeneros(String geneross) {
        generos.remove(geneross);
    }

    public String toStringGeneros() {
        StringBuilder sb = new StringBuilder();
        for (String generos : generos.keySet()) {
            sb.append(generos).append("\n");
        }
        return sb.toString();
    }

    public String toStringBooks() {
        StringBuilder sb = new StringBuilder();
        for (Book book : generos.values()) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : generos.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GenerosLiterarios generosliterarios = new GenerosLiterarios();


        generosliterarios.addGeneros("Drama", new Book("Hamlet", "Shakespeare", 1603));
        generosliterarios.addGeneros("Ficção Científica", new Book("Carro", "Eduardo", 1989));
        generosliterarios.addGeneros("Romance", new Book("Orgulho", "Duarte", 1013));
        generosliterarios.addGeneros("Mistério", new Book("TEsouro", "Jorge", 2002));
        generosliterarios.addGeneros("Fantasia", new Book("Praia", "Joao", 2000));
        generosliterarios.addGeneros("Drama", new Book("Romeu e Julieta", "Shakespeare", 1597));
        generosliterarios.addGeneros("Ficção Científica", new Book("Ocean", "Andre", 1999));
        generosliterarios.addGeneros("Romance", new Book("Amor", "Gabriel ", 2004));


        generosliterarios.alterarGeneros("Mistério", new Book("Sherlock Holmes", "Arthur Doyle", 1887));


        generosliterarios.removerGeneros("Romance");


        System.out.println("Gêneros e Livros:\n" + generosliterarios.toString());


        System.out.println("Gêneros:\n" + generosliterarios.toStringGeneros());

        System.out.println("Livros:\n" + generosliterarios.toStringBooks());
    }
}
