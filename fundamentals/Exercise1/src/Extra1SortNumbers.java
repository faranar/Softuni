import java.util.Scanner;

public class Extra1SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n;

        if (n1 > n2) {
            n = n1;
            n1 = n2;
            n2 = n;
        }
        if (n1 > n3) {
            n = n1;
            n1 = n3;
            n3 = n;
        }
        if (n2 > n3) {
            n = n2;
            n2 = n3;
            n3 = n;
        }
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
    }
}
