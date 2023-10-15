import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class _2GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        if (numbers.size() % 2 != 0) {
            numbers.add(numbers.size() / 2, 0);
        }
        for (int i = 0; i < numbers.size() / 2; i++) {
            result.add(numbers.get(i) + numbers.get(numbers.size() - i - 1));
        }
        for (Integer sum : result) {
            System.out.print(sum + " ");
        }
    }
}

