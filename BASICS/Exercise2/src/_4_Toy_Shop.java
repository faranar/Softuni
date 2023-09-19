import java.util.Scanner;

public class _4_Toy_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vac = Double.parseDouble(scanner.nextLine());
        double puz = Double.parseDouble(scanner.nextLine());
        double doll = Double.parseDouble(scanner.nextLine());
        double bear = Double.parseDouble(scanner.nextLine());
        double mignon = Double.parseDouble(scanner.nextLine());
        double truck = Double.parseDouble(scanner.nextLine());
        double num = puz + doll + bear + mignon + truck;
        double disc = 0;
        if (num>=50)
        {
            disc = 0.25;
        }
        double sum = (puz * 2.6) + (doll * 3) + (bear * 4.1) + (mignon * 8.2) + (truck * 2);
        double earn = ((sum - (sum * disc))*0.9);
        double diff;
        if (earn>=vac)
        {
            diff = earn - vac;
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else
        {   diff = vac - earn;
            System.out.printf("Not enough money! %.2f lv needed.", diff );
        }
    }
}
