import java.util.Scanner;

public class _6_Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char op = scanner.nextLine().charAt(0);
        double sum = 0;
        if (n2 == 0 && (op == '/' || op == '%'))
        {
            System.out.printf("Cannot divide %d by zero", n1);
        }
        else
        {
            switch (op)
            {
                case '+':
                    sum = n1 + n2;
                    break;
                case '-':
                    sum = n1 - n2;
                    break;
                case '*':
                    sum = n1 * n2;
                    break;
                case '/':
                    sum = (double) n1 / n2;
                    break;
                case '%':
                    sum = n1 % n2;
                    break;
            }
            if (op == '*' || op == '-' || op == '+')
            {
                String eo;
                if(sum % 2 ==0)
                {
                    eo = "even";
                }
                else
                {
                    eo = "odd";
                }
                System.out.printf("%d %c %d = %.0f - %s", n1 , op, n2, sum, eo);
            }
            else if (op == '/')
            {
                System.out.printf("%d %c %d = %.2f",n1 , op, n2, sum);
            }
            else
            {
                System.out.printf("%d %c %d = %.0f",n1 , op, n2, sum);
            }


        }


    }
}
