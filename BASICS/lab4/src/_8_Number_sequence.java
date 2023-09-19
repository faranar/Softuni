import java.util.Scanner;

public class _8_Number_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {

            int a = Integer.parseInt(scanner.nextLine());
            if (a < min)
            {
                min = a;
            }
            if (a > max)
            {
                max = a;
            }
        }
        System.out.printf("Max number: %d\n" +
                "Min number: %d", max, min);

    }


}
