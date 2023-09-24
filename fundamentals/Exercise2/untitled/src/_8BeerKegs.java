import java.util.Scanner;

public class _8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestKegVolume = Double.MIN_VALUE;
        String biggestKeg = "";
        for (int i = 0; i < n; i++) {
            String kegType = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI*Math.pow(kegRadius,2)*kegHeight;
            if (volume>biggestKegVolume){
                biggestKegVolume = volume;
                biggestKeg = kegType;
            }
        }
        System.out.println(biggestKeg);
    }
}
