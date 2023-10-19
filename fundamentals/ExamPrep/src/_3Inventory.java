import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(String::valueOf)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.contains("Craft!")){
            if(command.contains("Collect")){
                if(inventory.contains(command.split(" - ")[1])){
                    command = scanner.nextLine();
                    continue;
                }
                inventory.add(command.split(" - ")[1]);
            } else if (command.contains("Drop")) {
                inventory.remove(command.split(" - ")[1]);
            } else if (command.contains("Combine Items")) {
                    String[] items = command.split(" - ");
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).equals(items[1].split(":")[0])) {
                            inventory.add(i+1, items[1].split(":")[1]);
                        }

                }
            } else if (command.contains("Renew")) {
                if (inventory.contains(command.split(" - ")[1])){
                    inventory.remove(command.split(" - ")[1]);
                    inventory.add(command.split(" - ")[1]);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
