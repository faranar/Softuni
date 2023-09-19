import java.util.Scanner;

public class _2_Bonus_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double m = 0;
        if (n <= 100)
        {
            m = 5;
        }
        else if (n>100 && n<=1000)
        {
            m = n * 0.2;
        }
        else if (n > 1000)
        {
            m = n * 0.1;
        }
        double k = n % 2;
        if (k == 0)
        {
            m = m + 1;
        }
        double a = n % 10;
        if (a == 5)
        {
            m = m + 2;
        }
        double sum = n + m;
        System.out.printf("%.1f\n%.1f\n",m, sum );
    }
}
