import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i<s.length(); i++)
        {
            char letter = s.charAt(i);
            System.out.println(letter);
        }
    }
}
