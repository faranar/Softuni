import java.util.Scanner;

public class _9_Ski_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        int nights = days - 1;
        double price = 0;
        double dis = 0;
        switch (roomType)
        {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (days<10)
                {
                    dis = 0.3;
                }
                else if (days>+10 && days<=15)
                {
                    dis = 0.35;
                }
                else
                {
                    dis = 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                if (days<10)
                {
                    dis = 0.1;
                }
                else if (days>+10 && days<=15)
                {
                    dis = 0.15;
                }
                else
                {
                    dis = 0.2;
                }
                break;
        }
        double sum = (nights*price) -(nights*price*dis);

        double total = 0;
        if (rating.equals("positive"))
        {
            total = sum + sum*0.25;
        }
        else if (rating.equals("negative"))
        {
            total = sum -sum*0.10;
        }
        System.out.printf("%.2f", total);



    }
}
