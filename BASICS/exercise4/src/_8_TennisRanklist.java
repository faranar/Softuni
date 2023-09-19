import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int extrPoints = 0;
        double win = 0;
        for (int i = 0; i<n; i++)
        {
            String result = scanner.nextLine();
            switch (result)
            {
                case "W":
                    extrPoints = extrPoints + 2000;
                    win = win+1;
                    break;
                case "F":
                    extrPoints = extrPoints + 1200;
                    break;
                case "SF":
                    extrPoints = extrPoints + 720;
                    break;
            }

        }
        points = points + extrPoints;
        double winPercent = win/n*100;
        System.out.printf("Final points: %d\n", points);
        System.out.printf("Average points: %d\n", extrPoints/n);
        System.out.printf("%.2f%%", winPercent);
    }
}
