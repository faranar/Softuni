import java.util.Scanner;

public class _5_Supplies_for_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int prep = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double sum = (pens * 5.8) + (markers * 7.2) + (prep * 1.2);
        double sumd = sum - (sum * discount / 100);
        System.out.println(sumd);

    }
}
