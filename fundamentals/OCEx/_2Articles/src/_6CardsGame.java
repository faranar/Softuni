import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> player2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while(player1.size()>0 && player2.size()>0){
            if (Objects.equals(player1.get(0), player2.get(0))){
                player1.remove(0);
                player2.remove(0);
            } else if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            }else if (player1.get(0) < player2.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player1.remove(0);
                player2.remove(0);
            }
        }
        int sum = 0;
        if (player1.size()>player2.size()){
            for (int i = 0; i < player1.size(); i++) {
                sum+=player1.get(i);
            }
            System.out.printf("First player wins! Sum: %d\n",sum);
        }else {
            for (int i = 0; i < player2.size(); i++) {
                sum+=player2.get(i);
            }
            System.out.printf("Second player wins! Sum: %d\n",sum);
        }

    }
}
