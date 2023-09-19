import java.util.Scanner;

public class _7_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int b = 0;
        for (int i = 0; i < n; i++)
        {
            b = b + Integer.parseInt(scanner.nextLine());
        }
        System.out.println(b);
    }
}
