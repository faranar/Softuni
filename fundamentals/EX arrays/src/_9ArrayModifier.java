import java.util.Arrays;
import java.util.Scanner;

public class _9ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){
            if (command[0].equals("swap")){
                int temp = array[Integer.parseInt(command[1])];
                array[Integer.parseInt(command[1])] = array[Integer.parseInt(command[2])];
                array[Integer.parseInt(command[2])] = temp;
            } else if (command[0].equals("multiply")) {
                array[Integer.parseInt(command[1])] = array[Integer.parseInt(command[1])]*array[Integer.parseInt(command[2])];
            } else if (command[0].equals("decrease")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] -= 1;
                }
            }
            String[] command1 = scanner.nextLine().split(" ");
            command = command1;
        }
        String[] arrayString = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayString[i] = String.valueOf(array[i]);
        }
        System.out.println(String.join(", ",arrayString));

    }
}
