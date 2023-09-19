import java.util.Scanner;

public class _7_Hotel_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int stay = Integer.parseInt(scanner.nextLine());
        double ap = 0;
        double st = 0;
        double disSt = 0;
        double disAp = 0;
        switch (month)
        {
            case "May":
            case "October":
                st = 50;
                ap = 65;
                if (stay > 7 && stay <= 14)
                {
                    disSt = 0.05;
                }
                else if (stay > 14)
                {
                    disSt = 0.3;
                    disAp = 0.1;
                }
                break;
            case "June":
            case "September":
                st = 75.2;
                ap = 68.7;
                if (stay > 14)
                {
                    disSt = 0.2;
                    disAp = 0.1;
                }
                break;
            case "July":
            case "August":
                st = 76;
                ap = 77;
                if (stay > 14)
                {
                    disAp = 0.1;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", (ap - (ap*disAp))*stay, (st - (st*disSt))*stay);
    }
}
