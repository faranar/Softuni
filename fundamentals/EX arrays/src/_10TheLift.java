import java.util.Arrays;
import java.util.Scanner;

public class _10TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        boolean empty = false;
        for (int i = 0; i < wagons.length; i++) {
            while (wagons[i] < 4) {
                if (people > 0) {
                    wagons[i]++;
                    people--;
                    empty = false;
                } else {
                    empty = true;
                    break;
                }
            }
        }
        if(empty){
            System.out.println("The lift has empty spots!");
        }else if (people>0){
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
        }

        for (int i = 0; i < wagons.length; i++) {
            System.out.printf("%d ", wagons[i]);
        }
    }
}
