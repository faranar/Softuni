import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetSequence = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){
            int n1 = Integer.parseInt(command.split(" ")[1]);
            int n2 = Integer.parseInt(command.split(" ")[2]);
            if(command.contains("Shoot")){
                shoot(n1, n2, targetSequence);
            } else if (command.contains("Add")) {
                add(n1,n2, targetSequence);
            } else if (command.contains("Strike")) {
                strike(n1, n2, targetSequence);
            }
            command = scanner.nextLine();
        }
        System.out.println(targetSequence
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining("|")));
        }

    public static void shoot(int index, int power, List<Integer> targetSequence){
        if (targetSequence.size() > index && index >= 0) {
            int damage = targetSequence.get(index) - power;
            if (damage > 0) {
                targetSequence.set(index, damage);
            } else {
                targetSequence.remove(index);
            }
        }
    }
    public static void add(int index, int value, List<Integer> targetSequence){
        if (targetSequence.size() > index && index >= 0){
            targetSequence.add(index, value);
        }else {
            System.out.println("Invalid placement!");
        }
    }
    public static void strike(int index, int radius, List<Integer> targetSequence){
        if (index - radius < 0 || index + radius >= targetSequence.size()){
            System.out.println("Strike missed!");
        }else {
            for (int i = 0; i < radius*2 + 1; i++) {
                targetSequence.remove(index-radius);

            }

        }
    }
}
