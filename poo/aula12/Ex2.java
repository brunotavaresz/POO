package aula12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {
        String filename = "aula12/A_cidade_e_as_serras.txt"; 

        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            Map<Character, Map<String, Integer>> wordMap = new TreeMap<>();


            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");


                for (String word : words) {
                    if (word.length() >= 3) {
                        char initial = word.charAt(0);
                        Map<String, Integer> wordCountMap = wordMap.getOrDefault(initial, new HashMap<>());
                        int count = wordCountMap.getOrDefault(word, 0);
                        wordCountMap.put(word, count + 1);
                        wordMap.put(initial, wordCountMap);
                    }
                }
            }
            reader.close();


            FileWriter writer = new FileWriter("aula12/saida.txt"); 

            for (char initial : wordMap.keySet()) {
                writer.write(initial + ": ");

                Map<String, Integer> wordCountMap = wordMap.get(initial);
                for (String word : wordCountMap.keySet()) {
                    int count = wordCountMap.get(word);
                    writer.write(word + ", " + count + "; ");
                }

                writer.write("\n");
            }

            writer.close();

            System.out.println("Resultado no ficheiro saida.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

