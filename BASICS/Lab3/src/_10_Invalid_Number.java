import java.util.Scanner;

public class _10_Invalid_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        if (i != 0)
        {
            if(i<100 || i>200)
            {
                System.out.println("invalid");
            }
        }
    }
}
