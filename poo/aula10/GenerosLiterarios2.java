package aula10;
import java.util.*;

public class GenerosLiterarios2 {
    private Map<String, List<Book>> genres;

    public GenerosLiterarios2() {
        genres = new TreeMap<>();
    }

    public void addGenre(String generos, Book book) {
        if (!genres.containsKey(generos)) {
            genres.put(generos, new ArrayList<>());
        }
        genres.get(generos).add(book);
    }

    public void updateGenre(String generos, Book book) {
        if (genres.containsKey(generos)) {
            genres.get(generos).add(book);
        }
    }

    public void removeGenre(String generos) {
        genres.remove(generos);
    }

    public String toStringGenres() {
        StringBuilder sb = new StringBuilder();
        for (String generos : genres.keySet()) {
            sb.append(generos).append("\n");
        }
        return sb.toString();
    }

    public String toStringBooks() {
        StringBuilder sb = new StringBuilder();
        for (List<Book> books : genres.values()) {
            for (Book book : books) {
                sb.append(book.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Book>> entry : genres.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }

    public Book getRandomBook(String generos) {
        if (genres.containsKey(generos)) {
            List<Book> books = genres.get(generos);
            Random random = new Random();
            return books.get(random.nextInt(books.size()));
        }
        return null;
    }

    public static void main(String[] args) {
        GenerosLiterarios2 generosLiterarios2 = new GenerosLiterarios2();


        generosLiterarios2.addGenre("Drama", new Book("Hamlet", "Shakespeare", 1603));
        generosLiterarios2.addGenre("Ficção Científica", new Book("Carro", "Eduardo", 1989));
        generosLiterarios2.addGenre("Romance", new Book("Orgulho", "Duarte", 1013));
        generosLiterarios2.addGenre("Mistério", new Book("Tesouro", "Jorge", 2002));
        generosLiterarios2.addGenre("Fantasia", new Book("Praia", "Joao", 2000));
        generosLiterarios2.addGenre("Drama", new Book("Romeu e Julieta", "Shakespeare", 1597));
        generosLiterarios2.addGenre("Ficção Científica", new Book("Ocean", "Andre", 1999));
        generosLiterarios2.addGenre("Romance", new Book("Amor", "Gabriel ", 2004));



        generosLiterarios2.updateGenre("Mistério", new Book("Sherlock Holmes", "Arthur Doyle", 1887));


        generosLiterarios2.removeGenre("Romance");

        System.out.println("Gêneros e Livros:\n" + generosLiterarios2.toString());


        System.out.println("Gêneros:\n" + generosLiterarios2.toStringGenres());


        System.out.println("Livros:\n" + generosLiterarios2.toStringBooks());

        Book randomBook = generosLiterarios2.getRandomBook("Drama");
        System.out.println("Livro aleatório de Drama: " + randomBook.toString());
    }
}
    
