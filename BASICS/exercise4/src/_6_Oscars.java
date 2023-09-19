import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points= Double.parseDouble(scanner.nextLine());
        int scorer = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<scorer; i++)
        {
            String scName = scanner.nextLine();
            double scPoint = Double.parseDouble(scanner.nextLine());
            points = points + (scName.length() * scPoint / 2);
            if (points >= 1250.5)
            {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
                break;
            }

        }
        double diff = 1250.5 - points;
        if (diff > 0)
        {
            System.out.printf("Sorry, %s you need %.1f more!", name, diff);
        }
    }
}
