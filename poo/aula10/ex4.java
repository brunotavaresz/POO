package aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new FileReader("major.txt"));
		ArrayList<String> longwords = new ArrayList<>();
		while (input.hasNext()) {
			String word = input.next();
			System.out.println(word);
			if(word.length()>2) {
				longwords.add(word);
			}
		}
		System.out.println("Palavras com mais de 2 carateres: "+longwords);
		
		System.out.println("Palavras que terminam com 's': ");
		for(String word: longwords) {
			if(word.toLowerCase().endsWith("s")) {
				System.out.println(word);
			}
		}
		
		for(String word: longwords) {
			for(char c: word.toCharArray()) {
				if(!Character.isLetter(c)) {
					longwords.remove(word);
				}
			}
		}
		System.out.println("Palavras apenas com letras: "+longwords);
		
		input.close();
		
	}

}
