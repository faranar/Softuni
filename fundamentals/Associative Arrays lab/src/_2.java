import java.util.*;

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!words.containsKey(word)){
                words.put(word, new ArrayList<>());
            }
            words.get(word).add(synonym);
        }
        for(Map.Entry<String, List<String>> kvp : words.entrySet()){
            System.out.printf("%s - %s%n",
                    kvp.getKey(),
                    String.join(", ", kvp.getValue()));
        }
    }
}
