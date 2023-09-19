import java.util.Scanner;

public class _6_Barcode_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        for (int i = low; i <= high; i++)
        {
            boolean odd = true;
            int j = i;
            while (j>0)
            {
                if (j%2 == 0)
                {
                    odd = false;
                    break;
                }
                j = j/10;
            }
            if (odd) {
                System.out.println(i);
            }
        }
    }
}
