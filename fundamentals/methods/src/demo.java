import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = fullName(scanner);
        System.out.println(result);
    }
    public static String fullName(Scanner scanner){
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        return String.format("%s %s",firstName,lastName);
    }
}
