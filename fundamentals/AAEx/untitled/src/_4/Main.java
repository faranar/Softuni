package _4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parkingData = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("register")){
                if (!parkingData.containsKey(command[1])){
                    parkingData.put(command[1], command[2]);
                    System.out.printf("%s registered %s successfully\n", command[1], command[2]);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s\n", parkingData.get(command[1]));
                }
            }
            if (command[0].equals("unregister")){
                if (parkingData.containsKey(command[1])){
                    System.out.printf("%s unregistered successfully\n", command[1]);
                    parkingData.remove(command[1]);
                }else {
                    System.out.printf("ERROR: user %s not found\n",command[1]);
                }
            }
        }
        parkingData
                .entrySet()
                .forEach(e -> System.out.printf("%s => %s\n", e.getKey(), e.getValue()));
    }
}
