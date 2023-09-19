import java.util.Scanner;

public class _7_Projects_Creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int time = count * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, count);

    }
}
