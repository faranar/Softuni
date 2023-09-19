import java.util.Scanner;

public class _8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int fail = 0;
        int grad = 1;
        double sum = 0;
        double average;
        boolean graduated = true;
        while (grad <= 12)
        {
            double score = Double.parseDouble(scanner.nextLine());
            if (score<4) {
                fail++;
                if (fail >= 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grad);
                    graduated = false;
                    break;
                }
                continue;
            }
            sum +=score;
            grad++;

        }
        if (graduated)
        {
            average = sum/12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }

    }
}
