import java.util.Scanner;

public class _4_Fishing_Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        double dis;
        double extraDis = 0;
        if (fisher % 2 == 0 && !season.equals("Autumn"))
        {
            extraDis = 0.05;
        }
        switch (season)
        {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (fisher <= 6)
        {
            dis = 0.1;
        }
        else if (fisher <= 11)
        {
            dis = 0.15;
        }
        else
        {
            dis = 0.25;
        }
        double sum = rent - (rent*dis);
        double total = sum - (sum * extraDis);
        double diff = budget - total;
        if (diff >= 0)
        {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diff));
        }
    }
}
