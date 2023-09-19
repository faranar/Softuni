import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int n = 0;
        boolean a = false;
        while (!input.equals("No More Books"))
        {
            if (input.equals(book))
            {
                a = true;
                break;
            }
            n++;
            input = scanner.nextLine();
        }
        if (a)
        {
            System.out.printf("You checked %d books and found it.", n);
        }
        else
        {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", n);
        }
    }
}
