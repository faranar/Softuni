import java.util.Scanner;

public class _6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int factSum = 0;
        int a = num;
        while (a !=0){
            int currentDigit = a%10;
            a=a/10;
            int factorial = 1;
            for (int i = currentDigit; i>0; i--){
                factorial *=i;
            }
            factSum += factorial;
        }
        if (num == factSum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
