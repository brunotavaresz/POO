package aula12;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
	
	public static void main(String[] arg)  throws IOException{
		Set<String> set = new HashSet<>();
		int x = 0;
		
		Scanner entrada = new Scanner(new File("aula12/movies.txt"));
		entrada.useDelimiter("[\\p{Punct}\\s]+");
		
		while(entrada.hasNext()) {
			String word = entrada.next();
			x++;
			set.add(word);
		}
		entrada.close();
		System.out.println("Número Total de Palavras: " + x);
		System.out.println("Número de Diferentes Palavras: " + set.size());

	}

}
