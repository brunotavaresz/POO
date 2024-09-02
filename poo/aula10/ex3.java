package aula10;

import java.util.HashMap;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, StringBuilder> caracterpos = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!caracterpos.containsKey(c)) {
                caracterpos.put(c, new StringBuilder());
            }
            caracterpos.get(c).append("[").append(i).append("],");
        }

        for (Map.Entry<Character, StringBuilder> entry : caracterpos.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue().toString());
        }
    }
}
