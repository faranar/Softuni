import java.util.Scanner;

public class _2_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rec = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double delay = 0;
        if (length>=50)
        {
            delay = (int)(length/50)*30;
        }
        double newRec = length*time + delay;
        if (rec>newRec)
        {
            System.out.printf("Yes! The new record is %.2f seconds.", newRec);
        }
        else {
        System.out.printf("No! He was %.2f seconds slower.", Math.abs(rec - newRec));
        }
    }

}
