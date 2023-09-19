import java.util.Scanner;

public class _1_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double statue = rent*0.7;
        double catering = statue * 0.85;
        double sound = catering/2;
        double sum = rent + statue + sound + catering;
        System.out.printf("%.2f", sum);
    }

}
