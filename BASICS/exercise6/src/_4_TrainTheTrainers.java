import java.util.Scanner;

public class _4_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentaiton  = scanner.nextLine();
        double finalScore = 0;
        int count = 0;
        while (!presentaiton.equals("Finish"))
        {   double sum = 0;
            for (int i = 0; i <juryCount; i++) {
                double score = Double.parseDouble((scanner.nextLine()));
                sum += score;
            }
            System.out.printf("%s - %.2f.\n", presentaiton, sum/juryCount);
            finalScore +=sum/juryCount;
            count++;
            presentaiton = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalScore/count);
    }
}
