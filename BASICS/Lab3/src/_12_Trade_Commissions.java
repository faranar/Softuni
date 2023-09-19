import java.util.Scanner;

public class _12_Trade_Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double com = 0;
        double sum = 0;
        switch (town)
        {
            case "Sofia":
                if (s >= 0 && s<=500)
                {
                    com = 0.05;
                }
                else if (s > 500 && s<=1000)
                {
                    com = 0.07;
                }
                else if (s>1000 & s <= 10000)
                {
                    com = 0.08;
                }
                else if (s>10000)
                {
                    com = 0.12;
                }
                else
                {
                    System.out.println("error");
                }
                sum = com * s;
                if (s >= 0)
                {
                    System.out.printf("%.2f", sum);
                }
                break;
            case "Varna":
                if (s >= 0 && s<=500)
                {
                    com = 0.045;
                }
                else if (s > 500 && s<=1000)
                {
                    com = 0.075;
                }
                else if (s>1000 & s <= 10000)
                {
                    com = 0.1;
                }
                else if (s>10000)
                {
                    com = 0.13;
                }
                else
                {
                    System.out.println("error");
                }
                sum = com * s;
                if (s >= 0)
                {
                    System.out.printf("%.2f", sum);
                }
                break;

            case "Plovdiv":
                if (s >= 0 && s<=500)
                {
                    com = 0.055;
                }
                else if (s > 500 && s<=1000)
                {
                    com = 0.08;
                }
                else if (s>1000 & s <= 10000)
                {
                    com = 0.12;
                }
                else if (s>10000)
                {
                    com = 0.145;
                }
                else
                {
                    System.out.println("error");
                }
                sum = com * s;
                if (s >= 0)
                {
                    System.out.printf("%.2f", sum);
                }
                break;

            default:
                System.out.println("error");
                break;
        }


    }
}
