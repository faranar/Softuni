import java.util.Scanner;

public class _2_Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unacceptable = Integer.parseInt(scanner.nextLine());
        String com = "Enough";
        int n = 0;
        int count = 0;
        boolean a = false;
        double sum = 0;
        String input = scanner.nextLine();
        String lastTask = "";

        while (!input.equals(com))
        {

            int i = Integer.parseInt(scanner.nextLine());
            count ++;
            sum += i;
            lastTask = input;
            if (i<=4)
            {
                n++;
            }
            if (n==unacceptable)
            {
                a = true;
                break;
            }
            input = scanner.nextLine();



        }
        if (a)
        {
            System.out.printf("You need a break, %d poor grades.", unacceptable);
        }
        else
        {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s\n", sum/count, count, lastTask);
        }

    }
}
