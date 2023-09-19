import java.util.Scanner;

public class _5_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("Stop"))
        {
            if (input.equals("sea"))
            {
                if (sea >0){
                sum +=680;
                sea--;
                }
            }
            if (input.equals("mountain"))
            {
                if (mountain > 0)
                {
                    sum+=499;
                    mountain--;
                }
            }
            if (sea + mountain == 0)
            {
                System.out.print("Good job! Everything is sold.\n");
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Profit: %d leva.", sum);



    }
}
