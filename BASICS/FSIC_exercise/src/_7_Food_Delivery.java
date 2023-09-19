import java.util.Scanner;

public class _7_Food_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veg = Integer.parseInt(scanner.nextLine());
        double meal = (chicken * 10.35) + (fish * 12.4) + (veg * 8.15);
        double dessert = meal * 0.2;
        double sum = meal + dessert + 2.5;
        System.out.println(sum);
    }
}
