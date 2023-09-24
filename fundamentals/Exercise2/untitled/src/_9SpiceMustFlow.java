import java.util.Scanner;

public class _9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int storage = 0;
        int days = 0;
        if (startingYield >= 100) {
            do {
                storage += startingYield;
                startingYield -= 10;
                storage -= 26;
                days++;
            }
            while (startingYield >= 100);
            storage -= 26;
        }
        System.out.println(days);
        System.out.println(storage);

    }
}
