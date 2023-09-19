import java.util.Scanner;

public class _6_World_Swimming_Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rec = Double.parseDouble(scanner.nextLine());
        double goal = Double.parseDouble(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());
        int slow = (int)goal / 15;
        double time = (goal * rate) + (slow*12.5);
        double diff;
        if (time < rec)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.\n", time);
        }
        else
        {
            diff = time - rec;
            System.out.printf("No, he failed! He was %.2f seconds slower.\n", diff);
        }


    }
}
