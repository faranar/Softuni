import java.util.Scanner;

public class _6_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int totalTickets;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        while (!movie.equals("Finish"))
        {
            int student  = 0;
            int standard = 0;
            int kid = 0;

            int seats = Integer.parseInt(scanner.nextLine());
            int freeSeats = seats;
            String type = scanner.nextLine();
            while (!type.equals("End"))
            {
                switch (type) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                freeSeats --;
                if (freeSeats <= 0)
                {
                    break;
                }
                type = scanner.nextLine();
            }
            double percentFilled = (double)(seats-freeSeats)/seats*100;
            System.out.printf("%s - %.2f%% full.\n", movie, percentFilled);
            studentTickets += student;
            standardTickets += standard;
            kidTickets += kid;
            movie = scanner.nextLine();
        }
        totalTickets = standardTickets + studentTickets + kidTickets;
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 100 - (double)(totalTickets-studentTickets)/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.\n", 100 - (double)(totalTickets-standardTickets)/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.\n", 100 -(double)(totalTickets-kidTickets)/totalTickets*100);


    }
}
