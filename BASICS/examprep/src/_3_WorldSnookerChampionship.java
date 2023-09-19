import java.util.Scanner;

public class _3_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String ticket = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();
        double ticketPrice = 0;
        double photoPrice = 40;
        switch (stage)
        {
            case "Quarter final":
                switch (ticket)
                {
                    case "Standard":
                        ticketPrice = 55.5;
                        break;
                    case "Premium":
                        ticketPrice = 105.2;
                        break;
                    case "VIP":
                        ticketPrice = 118.9;
                        break;
                }
                break;
            case "Semi final":
                switch (ticket)
                {
                    case "Standard":
                        ticketPrice = 75.88;
                        break;
                    case "Premium":
                        ticketPrice = 125.22;
                        break;
                    case "VIP":
                        ticketPrice = 300.4;
                        break;
                }
                break;
            case "Final":
                switch (ticket)
                {
                    case "Standard":
                        ticketPrice = 110.1;
                        break;
                    case "Premium":
                        ticketPrice = 160.66;
                        break;
                    case "VIP":
                        ticketPrice = 400;
                        break;
                }
                break;
        }
        double sum = ticketPrice*count;
        if (sum>2500 && sum <=4000)
        {
            sum = sum*0.90;
        }
        else if (sum>4000)
        {
            sum = sum*0.75;
            photoPrice = 0;
        }
        if (photo.equals("Y")) {
            sum = sum + photoPrice*count;
        }
        System.out.printf("%.2f", sum);

        }


    }

