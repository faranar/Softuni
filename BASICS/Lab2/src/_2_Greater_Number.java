import java.util.Scanner;

public class _2_Greater_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a >= b)
        {
            System.out.printf("%d\n", a);
        }
        else
        {
            System.out.printf("%d\n", b);
        }

    }

}
