import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double diff = salary;
        for (int i = 0; i < n; i++)
        {
            String site = scanner.nextLine();
            int fine = 0;
            switch (site)
            {
                case "Facebook":
                    fine = 150;
                    diff = diff - fine;
                    break;
                case "Instagram":
                    fine =  100;
                    diff = diff - fine;
                    break;
                case "Reddit":
                    fine =  50;
                    diff = diff - fine;
                    break;
            }

            if(diff<=0)
            {
                System.out.printf("You have lost your salary.");
                break;
            }

        }
        if (diff>0)
        {
            System.out.printf("%.0f", diff);
        }
    }
}
