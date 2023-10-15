import java.util.Scanner;

public class _1SignOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sign(Integer.parseInt(scanner.nextLine()));


    }
    public static void sign(int n) {
        String sign;
        if (n == 0){
            sign = "zero";
        }
        else if (n > 0){
            sign = "positive";
        }
        else {
            sign = "negative";
        }
        System.out.printf("The number %d is %s\n", n, sign);

    }


}
