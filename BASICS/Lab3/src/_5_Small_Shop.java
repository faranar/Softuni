import java.util.Scanner;

public class _5_Small_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double finalPrice = 0;
        switch (item)
        {
            case "coffee":
                switch (town)
                {
                    case "Sofia":
                        price = 0.5;
                        break;
                    case "Plovdiv":
                        price = 0.4;
                        break;
                    case "Varna":
                        price = 0.45;
                        break;
                }
                break;
            case "water":
                switch (town)
                {
                    case "Sofia":
                        price = 0.8;
                        break;
                    case "Plovdiv":
                        price = 0.7;
                        break;
                    case "Varna":
                        price = 0.7;
                        break;
                }
                break;
            case "beer":
                switch (town)
                {
                    case "Sofia":
                        price = 1.2;
                        break;
                    case "Plovdiv":
                        price = 1.15;
                        break;
                    case "Varna":
                        price = 1.1;
                        break;
                }
                break;
            case "sweets":
                switch (town)
                {
                    case "Sofia":
                        price = 1.45;
                        break;
                    case "Plovdiv":
                        price = 1.3;
                        break;
                    case "Varna":
                        price = 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (town)
                {
                    case "Sofia":
                        price = 1.6;
                        break;
                    case "Plovdiv":
                        price = 1.5;
                        break;
                    case "Varna":
                        price = 1.55;
                        break;
                }
                break;
        }
        finalPrice = amount * price;
        System.out.println(finalPrice);

    }
}
