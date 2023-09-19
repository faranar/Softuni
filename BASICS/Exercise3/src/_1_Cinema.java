import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (type)
        {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.5;
                break;
            case "Discount":
                price = 5;
                break;
        }
        double sum = col * row * price;
        System.out.printf("%.2f leva", sum);
    }
}
