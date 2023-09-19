import java.util.Scanner;

public class _1_Sum_Seconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        int j= Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int sum = i + j + k;
        int min = sum / 60;
        int sec = sum % 60;
        if (sec < 10)
        {
            System.out.printf("%d:0%d", min, sec);
        }
        else
        {
            System.out.printf("%d:%d",min, sec);
        }
    }
}
