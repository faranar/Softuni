import java.util.Scanner;

public class _3_Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double apr = Double.parseDouble(scanner.nextLine());
        double ratePerMonth  = deposit * ( apr/100 ) / 12;
        double sum = deposit + term*ratePerMonth;

        System.out.println(sum);

    }
}
