import java.util.Scanner;

public class _8_Lunch_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());
        double lunch = (double)rest / 8;
        double chill = (double)rest / 4;
        double timeLeft = rest - lunch - chill;
        double diff = Math.ceil(Math.abs(timeLeft - duration));
        if (timeLeft >= duration)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.\n", series, diff);
        }
        else
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.\n", series, diff);
        }
    }
}
