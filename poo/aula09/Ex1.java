package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import aula05.Data;
import aula06.Pessoa;

public class Ex1 {
    public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();

		for (int i = 10; i <= 100; i += 10) {
            c1.add(i);
        }
			
		System.out.println("Size: " + c1.size());

		for (int i = 0; i < c1.size(); i++) {
            System.out.println("Elemento: " + c1.get(i));
        }	

		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);

		System.out.println(c2.contains("Frio"));
		System.out.println(c2.lastIndexOf("Vento"));

		Set<Pessoa> c3 = new HashSet<>(); // hashset nao garante ordem de insercao e nao permite repetidos (pelo equals) 
		c3.add(new Pessoa("Bruno", 1234456, new Data(15, 10, 2004)));
		c3.add(new Pessoa("Andre", 325523, new Data(18, 12, 2000)));
		c3.add(new Pessoa("Alexandre", 532434, new Data(10, 3, 2003)));
		c3.add(new Pessoa("Joao", 3463543, new Data(29, 7, 2002)));
		c3.add(new Pessoa("Carlos", 345353, new Data(10, 1, 2005)));

		Iterator<Pessoa> i = c3.iterator(); // iterator e uma interface que permite percorrer colecoes
		while (i.hasNext())
			System.out.println(i.next());

		Set<Data> c4 = new TreeSet<>();
		c4.add(new Data(15, 10, 2004));
		c4.add(new Data(18, 12, 2000));
		c4.add(new Data(10, 3, 2003));
		c4.add(new Data(29, 7, 2002));
		c4.add(new Data(10, 1, 2005));
		
		Iterator<Data> j = c4.iterator();
        
		while (j.hasNext()) {
            System.out.println(j.next());
        }	
	}
}

    

