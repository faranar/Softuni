import java.util.Scanner;

public class _11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostCount = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        double count = 0;
        double rageCost = 0;
        double counter = 0;
        for (int i = 1; i <= lostCount; i++) {
            counter = i;
            if (counter % 2 == 0){
                rageCost +=headset;
            }
            if (counter % 3 == 0){
                rageCost +=mouse;
            }
            if (counter % 2 == 0 && i % 3 == 0){
                rageCost += keyboard;
                count++;
            }
            if (count == 2){
                rageCost +=display;
                count -= 2;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.",rageCost);
    }
}
