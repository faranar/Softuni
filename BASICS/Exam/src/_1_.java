import java.util.Scanner;

public class _1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fat = Double.parseDouble(scanner.nextLine())/100;
        double protein = Double.parseDouble(scanner.nextLine())/100;
        double carb = Double.parseDouble(scanner.nextLine())/100;
        double cal = Double.parseDouble(scanner.nextLine());
        double  water = Double.parseDouble(scanner.nextLine())/100;
        double weight = fat*cal/9 + protein*cal/4 + carb*cal/4;
        double calPerG = cal/weight - water*cal/weight;
        System.out.printf("%.4f", calPerG);


    }
}
