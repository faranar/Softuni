import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int sale = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toy = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                money = money + i*5 - 1;
            }
            else
            {
                toy = toy + 1;
            }
        }
        toy = toy * sale;
        double sum = toy + money;
        double diff = sum - price;
        if (diff >=0)
        {
            System.out.printf("Yes! %.2f", diff);
        }
        else
        {
            System.out.printf("No! %.2f", Math.abs(diff));
        }
    }
}
