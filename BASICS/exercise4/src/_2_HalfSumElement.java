import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int a = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0; i < n; i++)
        {
            int j = Integer.parseInt(scanner.nextLine());
            if (j>a)
            {
                a=j;
            }
            sum = sum + j;
        }
        sum = sum - a;
        int diff = a-sum;
        if (a == sum) {
            System.out.printf("Yes\n" +
                    "Sum = %d", sum);
        }
        else
        {
            System.out.printf("No\n" +
                    "Diff = %d", Math.abs(diff));
        }
    }
}
