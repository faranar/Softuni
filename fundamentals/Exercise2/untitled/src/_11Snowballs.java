import java.util.Scanner;

public class _11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnowTemp = Integer.parseInt(scanner.nextLine());
            int snowballTimeTemp = Integer.parseInt(scanner.nextLine());
            int snowballQualityTemp = Integer.parseInt(scanner.nextLine());
            double snowballValueTemp = Math.pow((double)snowballSnowTemp/snowballTimeTemp, snowballQualityTemp);
            if(snowballValueTemp>snowballValue){
                snowballValue = snowballValueTemp;
                snowballSnow = snowballSnowTemp;
                snowballTime = snowballTimeTemp;
                snowballQuality = snowballQualityTemp;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
    }
}
