import java.util.Scanner;

public class _2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

        for (int i = low; i <= high; i++)
        {
            int sum0 = 0;
            int sum1 = 0;
            String current = String.valueOf(i);
            for (int j = 0; j<current.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(current.charAt(j)));
                if (j % 2 == 0) {
                    sum0 += currentDigit;
                } else {
                    sum1 += currentDigit;
                }

            }
            if (sum0 == sum1) {
                System.out.print(i + " ");
            }
        }


    }
}
