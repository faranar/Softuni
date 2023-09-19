import java.util.Scanner;

public class _2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirt = Double.parseDouble(scanner.nextLine());
        double ball = Double.parseDouble(scanner.nextLine());
        double sum = (shirt + (shirt*0.75) + (shirt*0.75*0.2) + (shirt + shirt*0.75)*2)*0.85;
        if (sum>ball)
        {
            System.out.printf("Yes, he will earn the world-cup replica ball!\n" +
                    "His sum is %.2f lv.\n",sum);
        }
        else
        {
            System.out.printf("No, he will not earn the world-cup replica ball.\n" +
                    "He needs %.2f lv. more.\n", ball - sum);
        }

    }
}
