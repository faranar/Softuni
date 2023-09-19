import java.util.Scanner;

public class _4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double rating = 0;
        double sales = 0;
        double percent = 0;
        for (int i = n; i > 0; i--) {
            int input = Integer.parseInt(scanner.nextLine());
            int r = input % 10;
            rating += r;
            int pSales = input / 10;
            if (r == 2) {
                percent = 0;
            }
            if (r == 3) {
                percent = 0.5;
            }
            if (r == 4) {
                percent = 0.7;
            }
            if (r == 5) {
                percent = 0.85;
            }
            if (r == 6) {
                percent = 1;
            }
            sales += percent * pSales;
        }
        System.out.printf("%.2f\n%.2f", sales, rating/n);
    }
}
