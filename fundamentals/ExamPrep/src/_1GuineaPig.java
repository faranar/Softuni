import java.util.Scanner;

public class _1GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double food = Double.parseDouble(scanner.nextLine())*1000;
         double hay = Double.parseDouble(scanner.nextLine())*1000;
         double cover = Double.parseDouble(scanner.nextLine())*1000;
         double weight = Double.parseDouble(scanner.nextLine())*1000;
         int count = 0;

        for (int i = 0; i < 30; i++) {
            food -= 300;
            count++;
            if(count % 2 == 0) {
                hay -= food * 0.05;
            }
            if (count % 3 == 0){
                cover -=weight / 3;
            }
            if (food <= 0.0 || hay <= 0.0 || cover <= 0.0){
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food/1000, hay/1000, cover/1000);
    }
}
