import java.util.Scanner;

public class _1SignOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        sign(num);
    }
    public static void sign(int num){
        if(num == 0){
            System.out.println("The number 0 is zero");
        }else if (num > 0){
            System.out.printf("The number %d is positive\n", num);
        }else{
            System.out.printf("The number %d is negative\n", num);
        }
    }
}
