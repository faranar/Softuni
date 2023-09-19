import java.util.Scanner;

public class _3_Time_15_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int m1 = m + 15;
        int h1;
        if (m1>59)
        {
            m1 = m1 - 60;
            h1 = h + 1;
        }
        else {
            h1 = h;
        }
        if(h1 > 23)
        {
            h1 = 0;
        }

        System.out.printf("%d:%02d", h1, m1);

    }

}
