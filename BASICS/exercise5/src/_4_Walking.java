import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepCount = 10000;
        while (stepCount > 0)
        {   String input = scanner.nextLine();
            if (input.equals("Going home"))
            {
                int lastSteps = Integer.parseInt(scanner.nextLine());
                stepCount -=lastSteps;

                break;
            }
            int n = Integer.parseInt(input);
            stepCount -=n;

        }
        if (stepCount > 0)
        {
            System.out.printf("%d more steps to reach goal.", stepCount);
        }
        else
        {
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!\n", Math.abs(stepCount));
        }


    }
}
