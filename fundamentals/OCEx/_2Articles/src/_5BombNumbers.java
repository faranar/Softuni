import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] specialBombID = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(specialBombID[0]);
        int pow = Integer.parseInt(specialBombID[1]);

        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) == bomb) {
                int leftCount = Math.max(0, i -pow);
                int rightCount  = Math.min(i + pow, sequence.size()-1);

                for (int j = rightCount; j >= leftCount ; j--) {
                    sequence.remove(j);
                }
            }

        }
        int sum = 0;
        for (int i = 0; i < sequence.size(); i++) {
            sum+=sequence.get(i);
        }
        System.out.println(sum);
    }
}
