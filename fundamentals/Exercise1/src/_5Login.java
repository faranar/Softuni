import java.util.Scanner;

public class _5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String pass = "";
        for (int i = 0; i < userName.length(); i++) {
            pass = userName.charAt(i) + pass;
        }

        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals(pass)) {
            if (count < 3) {
                System.out.println("Incorrect password. Try again.");
                count++;
            } else {
                System.out.printf("User %s blocked!", userName);
                return;
            }
            input = scanner.nextLine();
        }
        if (count<4){
            System.out.printf("User %s logged in.",userName);
        }
    }
}
