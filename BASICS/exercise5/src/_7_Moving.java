import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int vol = w * l * h;
        boolean done = true;
        while (vol >= 0)
        {
            String input = scanner.nextLine();
            if (input.equals("Done"))
            {
                System.out.printf("%d Cubic meters left.", vol);
                done = false;
                break;
            }
            int box = Integer.parseInt(input);
            vol -= box;
        }
        if (done)
        {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(vol));
        }
    }
}
