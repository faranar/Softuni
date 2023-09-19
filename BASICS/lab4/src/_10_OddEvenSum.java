import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++)
        {
            int a = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0)
            {
                even = even + a;
            }
            else
            {
                odd = odd + a;
            }
        }
        int diff = even-odd;
        if (diff == 0) {
            System.out.printf("Yes\n" +
                    "Sum = %d", even);
        }
        else
        {
            System.out.printf("No\n" +
                    "Diff = %d", Math.abs(diff));

        }
    }

}
