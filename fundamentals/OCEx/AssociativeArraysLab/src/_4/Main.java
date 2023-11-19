package _4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .sorted((a,b)-> {
                    int result = a.length() - b.length();
                    if(result==0){
                        return b.compareTo(a);
                    }
                    return result;
                })
                .toArray(String[]::new);
        for(String word:words){
            System.out.println(word);
        }
    }
}
