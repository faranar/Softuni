import java.util.Scanner;

public class _10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        double half = pokePower/2.0;
        int count = 0;
        while (pokePower >= distance){
            pokePower -= distance;
            if(pokePower == half && exhaustionFactor!=0){
                pokePower = pokePower/exhaustionFactor;
            }
            count ++;
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}
