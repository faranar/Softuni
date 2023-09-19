import java.util.Scanner;

public class _4_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pph = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int time = pages/pph/days;
        System.out.println(time);

    }
}
