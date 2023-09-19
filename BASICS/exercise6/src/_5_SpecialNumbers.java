import java.util.Scanner;

public class _5_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i < 10000; i++)
        {   String current = String.valueOf(i);
            int count = 0;
            for (int j = 0; j<current.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(current.charAt(j)));
                if (digit == 0) {
                    break;
                }
                if (n%digit ==0) {
                    count++;
                }
            }

            if (count ==4) {
                System.out.print(i + " ");
            }
        }
        }
    }

