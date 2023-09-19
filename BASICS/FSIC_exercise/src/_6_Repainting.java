import java.util.Scanner;

public class _6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double mat = ((nylon + 2) * 1.5) + ((paint + paint * 0.1) * 14.5) + (thinner * 5) + 0.4;
        double rate = mat * 0.3;
        double sum = mat + rate * time;
        System.out.println(sum);
    }
}
