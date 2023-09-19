import java.util.Scanner;

public class _7_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lowest = Integer.MAX_VALUE;
        while (!input.equals("Stop"))
        {

            int current = Integer.parseInt(input);
            if (current<lowest)
            {
                lowest = current;
            }
            input = scanner.nextLine();
        }
        System.out.println(lowest);

    }
}
