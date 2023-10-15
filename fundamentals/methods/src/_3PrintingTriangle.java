import java.util.Scanner;

public class _3PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <=size ; i++) {
            printRow(i);
        }
        for (int i = size-1; i >0 ; i--) {
            printRow(i);
        }
    }

    public static void printRow(int elementCount){
        for (int i = 1; i <= elementCount ; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

}
