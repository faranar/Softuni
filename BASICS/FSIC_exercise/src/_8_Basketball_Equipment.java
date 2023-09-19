import java.util.Scanner;

public class _8_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax * 0.6;
        double suit = shoes * 0.8;
        double ball = suit / 4;
        double acc = ball / 5;
        double total = tax + shoes + suit + ball + acc;
        System.out.println(total);
    }
}
