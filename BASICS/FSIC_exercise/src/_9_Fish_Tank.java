import java.util.Scanner;

public class _9_Fish_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double volume = length * width * height * 0.001;
        double clutter = volume * percent;
        double volumeWater = volume - clutter;
        System.out.println(volumeWater);

    }
}
