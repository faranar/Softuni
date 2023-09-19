import java.util.Scanner;

public class _6_ConcentrateData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String birthplace = scanner.nextLine();
        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + birthplace + ".");

    }
}
