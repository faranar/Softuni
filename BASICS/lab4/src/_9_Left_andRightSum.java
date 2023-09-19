import java.util.Scanner;

public class _9_Left_andRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++)
        {
            sum1 = sum1 + Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n; i++)
        {
            sum2 = sum2 + Integer.parseInt(scanner.nextLine());
        }
        if(sum1 == sum2)
        {
            System.out.printf("Yes, sum = %d", sum1);
        }
        else
        {
            int diff = sum1-sum2;
            System.out.printf("No, diff = %d",Math.abs(diff));
        }


    }

}
