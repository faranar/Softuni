import java.util.Scanner;

public class _3_New_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double dis = 0;
        double gouge = 0;
        double price = 0;
        switch (flower)
        {
            case "Roses":
                price = 5;
                if (num > 80)
                {
                    dis = 0.1;
                }
                break;
            case "Dahlias":
                price = 3.8;
                if (num > 90)
                {
                    dis = 0.15;
                }
                break;
            case "Tulips":
                price= 2.8;
                if (num > 80)
                {
                    dis = 0.15;
                }
                break;
            case "Narcissus":
                price = 3;
                if (num < 120)
                {
                    gouge = 0.15;
                }
                break;
            case "Gladiolus":
                if (num < 80)
                {
                    gouge = 0.2;
                }
                price = 2.5;
                break;
        }
        double sum = num * price;
        double total = sum - (sum * dis) + (sum * gouge);
        double diff = budget - total;
        if (diff >= 0)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, flower, diff);
        }
        else
        {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(diff));
        }



    }
}
