import java.util.Scanner;

public class _6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int size = l * w;
        boolean stop = false;
        while (size>0)
        {
            String input = scanner.nextLine();
            if (input.equals("STOP"))
            {
                System.out.printf("%d pieces are left.", size);
                stop = true;
                break;
            }
            int taken = Integer.parseInt(input);
            size -= taken;
        }
        if (stop == false)
        {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
        }
    }
}
