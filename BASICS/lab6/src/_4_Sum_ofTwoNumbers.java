import java.util.Scanner;

public class _4_Sum_ofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int goal = Integer.parseInt(scanner.nextLine());
        int comb = 0;
        boolean a = true;
        loop:{
            for (int i = low; i <= high; i++) {
                for (int j = low; j <= high; j++) {
                    comb++;
                    if (i + j == goal) {
                        System.out.printf("Combination N:%d (%d + %d = %d)", comb, i, j, goal);
                        a = false;
                        break loop;
                    }
                }
            }
        }
        if(a) {
            System.out.printf("%d combinations - neither equals %d", comb, goal);
        }

    }
}
