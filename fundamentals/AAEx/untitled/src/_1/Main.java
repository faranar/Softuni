package _1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();
        for(char symbol : input.toCharArray()){
            if(symbol == ' '){
                continue;
            }
            if (!chars.containsKey(symbol)){
                chars.put(symbol, 1);
            }else {
                int current = chars.get(symbol);
                chars.put(symbol, current +1);
            }

        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()){
            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }

        chars
                .entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
