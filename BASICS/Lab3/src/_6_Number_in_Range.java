import java.util.Scanner;

public class _6_Number_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        if (i!=0 && i<=100 && i>=-100)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
