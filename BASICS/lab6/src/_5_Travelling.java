import java.util.Scanner;

public class _5_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        while (!town.equals("End")) {
            double budget = Double.parseDouble((scanner.nextLine()));
            int sum = 0;
            while (sum < budget) {
                double savings = Double.parseDouble((scanner.nextLine()));
                sum += savings;
            }
            System.out.printf("Going to %s!\n", town);
            town = scanner.nextLine();

        }


    }
}
