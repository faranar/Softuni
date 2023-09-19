import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double goal = Double.parseDouble(scanner.nextLine());
        double start = Double.parseDouble(scanner.nextLine());
        int count = 0;
        int spendCount = 0;
        boolean spendtrift = true;
        double current = start;
        while (current<goal)
        {
            String net = scanner.nextLine();
            double n = Double.parseDouble(scanner.nextLine());
            if (net.equals("spend"))
            {
                count++;
                spendCount++;
                current -= n;
                if (current < 0)
                {
                    current = 0;
                }
            }
            if (net.equals("save"))
            {
                current += n;
                count++;
                spendCount = 0;
            }
            if (spendCount == 5)
            {
                System.out.printf("You can't save the money.\n" +
                        "%d", count);
                spendtrift = false;
                break;
            }

        }
        if (spendtrift)
        {
            System.out.printf("You saved the money for %d days.",count);
        }


    }
}
