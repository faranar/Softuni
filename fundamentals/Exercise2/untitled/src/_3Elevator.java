import java.util.Scanner;

public class _3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int count = people/capacity;
        if (people%capacity!=0){
            count++;
        }
        System.out.println(count);
    }
}
