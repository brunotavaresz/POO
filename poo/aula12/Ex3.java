package aula12;

import java.util.*;
import java.io.*;

public class Ex3{
	
	public static void main(String[] arg) throws IOException{
		Set<Movie> filmes = new TreeSet<>(Movie::compararNome); //cria um set de filmes ordenado por nome (usando o método compararNome da classe Movie)
		Set<String> generos = new TreeSet<>(); //cria um set de géneros ordenado por nome
		
		System.out.println("a) TESTES AO MÉTODO COMPRAR NOME DA CLASSE MOVIE\n");
		Movie a = new Movie("west", 59.7, "R", "Comédia", 99);
		Movie b = new Movie("Tomorrow", 24.7, "R", "Comédia", 60);
		System.out.println(Movie.compararNome(a, b)); //compara os nomes dos filmes a e b e imprime o resultado
		System.out.println(Movie.compararNome(b, a));
		System.out.println(Movie.compararNome(a, a)); 
				
			
		try(Scanner file = new Scanner(new File("aula12/movies.txt"))){
			file.nextLine(); //primeira linha inutil
			System.out.println("\n\nLEITURA DO FICHEIRO\n");
			while(file.hasNext()) { //enquanto houver linhas
				String[] data = file.nextLine().split("\t"); //separador de dados	
				System.out.println(Arrays.toString(data)); //imprime os dados de cada linha do ficheiro (nome, score, rating, genero, tempo) num array
				filmes.add(new Movie(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]))); //adiciona os dados ao set de filmes e ao set de generos
				generos.add(data[3]);
			}
			file.close();
		}catch(IOException e) { //exceção de erro
			System.err.println("Eroo: "+e); //mensagem de erro
		}
		
		System.out.println("\n\nb)SET ORDENADO POR NOMES\n");
		filmes.forEach(x -> System.out.println(x)); //imprime os filmes ordenados por nome (usando o método toString da classe Movie)
		
		List<Movie> filmesList = new ArrayList<>(); //cria um arraylist de filmes
		filmesList.addAll(filmes); //adiciona os filmes ao arraylist de filmes
		System.out.println("\n\nLISTA DE MOVIES SEM ORDENAÇÃO\n");
		filmesList.forEach(m -> System.out.println(m)); //imprime os filmes sem ordenação
		
		Collections.sort(filmesList, Movie::compararScoreDescrescente); //ordena os filmes por score decrescente
		System.out.println("\n\nc)LISTA DE MOVIES ORDENADOS POR SCORE DECRESCENTE\n");
		filmesList.forEach(m -> System.out.println(m)); //imprime os filmes ordenados por score decrescente
		
		Collections.sort(filmesList, Movie::compararTempoCrescente); //ordena os filmes por tempo crescente
		System.out.println("\n\nc)LISTA DE MOVIES ORDENADOS POR RUNNING TIME CRESCENTE\n");
		filmesList.forEach(m -> System.out.println(m)); //imprime os filmes ordenados por tempo crescente
		
		System.out.println("\n\nd)LISTA DE GÉNEROS DISTINTOS (ORDEM ALFABÉTICA)\n");
		generos.forEach(g -> System.out.println(g)); //imprime os géneros distintos (usando o método toString da classe Movie)
        System.out.println("Número de géneros: " + generos.size()); //imprime o número de géneros distintos
		
		filmes.removeIf(m -> m.getScore()<=60.0); //remove os filmes com score<=60
		filmes.removeIf(m -> !m.getGenero().equalsIgnoreCase("comedy")); //remove os filmes que não são do género comedy
		System.out.println("\n\nLISTA DE MOVIES FILTRADOS PARA SCORE>60 E GÉNERO COMEDY\n");
		filmes.forEach(m -> System.out.println(m)); //imprime os filmes filtrados
		
		try(PrintWriter file=new PrintWriter(new File("aula12/selection.txt"))){ //cria um ficheiro selection.txt
			file.println("e)FILMES FILTRADOS PARA UM SCORE>60 E GÉNERO COMEDY\n");
			filmes.forEach(m -> file.println(m)); //imprime os filmes filtrados no ficheiro selection.txt
			System.out.println("\n\ne)FICHEIRO SELECTION.TXT CRIADO COM SUCESSO NO DIRETÓRIO DO PROGRAMA\n");
		}catch (IOException e) { //exceção de erro
			System.err.println("Erro: " + e); //mensagem de erro
		}
	}

}
