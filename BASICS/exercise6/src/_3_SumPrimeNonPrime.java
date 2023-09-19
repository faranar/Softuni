import java.util.Scanner;

public class _3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop"))
        {
            boolean prime = true;
            int n = Integer.parseInt(input);
            if (n<0)
            {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i<n; i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                primeSum +=n;
            }
            else
            {
                nonPrimeSum +=n;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeSum);

    }
}
