import java.util.Scanner;

public class _6_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int biggest = Integer.MIN_VALUE;
        while (!input.equals("Stop"))
        {

            int current = Integer.parseInt(input);
            if (current>biggest)
            {
                biggest = current;
            }
            input = scanner.nextLine();
        }
        System.out.println(biggest);

    }
}
