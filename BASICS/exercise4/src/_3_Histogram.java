import java.util.Scanner;

public class _3_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 0; i < n; i++)
        {
            int k = Integer.parseInt(scanner.nextLine());
            if (k < 200)
            {
                p1 = p1+1;
            }
            else if (k < 400)
            {
                p2 = p2+1;
            }
            else if (k < 600)
            {
                p3 = p3+1;
            }
            else if (k < 800)
            {
                p4 = p4+1;
            }
            else
            {
                p5 = p5+1;
            }
        }
        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;
        p4 = p4 / n * 100;
        p5 = p5 / n * 100;
        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n",p1, p2, p3, p4, p5 );
    }
}
