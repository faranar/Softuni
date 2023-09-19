import java.util.Scanner;

public class _5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine())*100;
        int count = 0;
        while ((int)change > 0)
        {
            if ((int)change - 200 >= 0)
            {
                count++;
                change -= 200;
            }
            else if ((int)change - 100 >= 0)
            {
                count++;
                change -= 100;

            }
            else if ((int)change - 50 >= 0)
            {
                count++;
                change -= 50;
            }
            else if ((int)change - 20 >= 0)
            {
                count++;
                change -= 20;
            }
            else if ((int)change - 10 >= 0)
            {
                count++;
                change -= 10;
            }
            else if((int)change - 5 >= 0)
            {
                count++;
                change -= 5;
            }
            else if ((int)change - 2 >= 0)
            {
                count++;
                change -= 2;
            }
            else
            {
                count++;
                change -= 1;
            }

        }
        System.out.println(count);
    }
}
