import java.util.Scanner;

public class _6_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int product = 0;
        int a;
        int b;
        int c;
        int d;
        boolean na = true;
        loop:
        {
            for (a = 1; a <= 9; a++) {
                for (b = 9; b >= a; b--) {
                    for (c = 0; c <= 9; c++) {
                        for (d = 9; d >= c; d--) {
                            sum = a + b + c + d;
                            product = a * b * c * d;
                            if (sum == product && n % 10 == 5) {
                                System.out.printf("%d%d%d%d", a, b, c, d);
                                na = false;
                                break loop;
                            }
                            else if(product/sum == 3 && n % 3 == 0)
                            {
                                System.out.printf("%d%d%d%d", d, c, b, a);
                                na = false;
                                break loop;
                            }
                        }
                    }
                }
            }
        }
        if (na)
        {
            System.out.println("Nothing found");
        }
    }
}
