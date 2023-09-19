import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget =Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String place = null;
        String acc = null;
        if(budget<=100)
        {
            place = "Bulgaria";
            switch (season)
            {
                case "summer":
                    acc = "Camp";
                    price = budget * 0.3;
                    break;
                case "winter":
                    acc = "Hotel";
                    price = budget * 0.7;
            }
        }
        else if (budget<=1000)
        {
            place = "Balkans";
            switch (season)
            {
                case "summer":
                    acc = "Camp";
                    price = budget * 0.4;
                    break;
                case "winter":
                    acc = "Hotel";
                    price = budget * 0.8;
            }
        }
        else
        {
            place = "Europe";
            acc = "Hotel";
            price = budget * 0.9;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", place, acc, price);
    }
}
