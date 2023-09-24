import java.util.Scanner;

public class _7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int fill = 0;
        for (int i = 0; i < n; i++) {
            int pour = Integer.parseInt(scanner.nextLine());
            if (fill + pour > capacity){
                System.out.println("Insufficient capacity!");
                continue;
            }
            fill += pour;
        }
        System.out.println(fill);
    }
}
