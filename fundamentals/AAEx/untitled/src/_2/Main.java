package _2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();
        while (true){
            String resource = scanner.nextLine();
            if (resource.equals("stop")){
                break;
            }
            int resourceCount = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(resource)){
                resources.put(resource, resourceCount);
            }else {
                resources.put(resource, resources.get(resource) + resourceCount);
            }
        }
        resources
                .entrySet()
                .forEach(e -> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));
    }
}
