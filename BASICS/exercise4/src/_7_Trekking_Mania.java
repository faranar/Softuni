import java.util.Scanner;

public class _7_Trekking_Mania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double mus = 0;
        double mon = 0;
        double kil = 0;
        double k2 = 0;
        double ev = 0;
        for (int i = 0; i<groups; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (num<=5)
            {
                mus = mus + num;
            }
            else if (num<=12)
            {
                mon = mon + num;
            }
            else if (num<=25)
            {
                kil = kil + num;
            }
            else if (num<=40)
            {
                k2 = k2 + num;
            }
            else
            {
                ev = ev + num;
            }
        }
        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n", mus/sum*100,mon/sum*100, kil/sum*100, k2/sum*100, ev/sum*100 );
    }
}
