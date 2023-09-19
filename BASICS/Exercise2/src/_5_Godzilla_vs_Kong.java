import java.util.Scanner;

public class _5_Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int stat = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothSum = clothPrice * stat;
        if(stat > 150)
        {
            clothSum = clothSum * 0.9;
        }
        double ex = decor + clothSum;
        double diff;
        if (ex <= budget)
        {
            diff= budget - ex;
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", diff);
        }
        else
        {
            diff = ex - budget;
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", diff);
        }
    }
}
