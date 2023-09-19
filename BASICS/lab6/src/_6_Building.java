import java.util.Scanner;

public class _6_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        for (int f = floor; f>=1; f--) {
            for (int i = 0; i < rooms; i++) {
                if(f == floor) {
                    System.out.printf("L%d%d ", f, i);
                }
                else if(f%2==0)
                {
                    System.out.printf("O%d%d ", f, i);
                }
                else
                {
                    System.out.printf("A%d%d ", f, i);
                }
            }
            System.out.println();

        }

    }
}
