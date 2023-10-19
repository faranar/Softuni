import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays
                .stream(scanner.nextLine().split("!"))
                .map(String::valueOf)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.contains("Go Shopping!")){
            if(command.contains("Urgent")){
                if(shoppingList.contains(command.split(" ")[1])){
                    command = scanner.nextLine();
                    continue;
                }
                shoppingList.add(0, command.split(" ")[1]);
            } else if (command.contains("Unnecessary")) {
                shoppingList.remove(command.split(" ")[1]);
            } else if (command.contains("Correct")) {
                if (shoppingList.contains(command.split(" ")[1])){
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if (shoppingList.get(i).equals(command.split(" ")[1])) {
                            shoppingList.set(i, command.split(" ")[2]);
                        }
                    }
                }
            } else if (command.contains("Rearrange")) {
                if (shoppingList.contains(command.split(" ")[1])){
                    shoppingList.remove(command.split(" ")[1]);
                    shoppingList.add(command.split(" ")[1]);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
