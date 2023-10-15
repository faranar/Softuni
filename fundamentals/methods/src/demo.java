import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hello(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }
    public static void hello(String name, int age){
        System.out.printf("Hello %s, age:%d! \n", name, age);
    }
}
