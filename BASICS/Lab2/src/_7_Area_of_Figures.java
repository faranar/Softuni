import java.util.Scanner;

public class _7_Area_of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        double b;
        double c;
        double sum = 0;
        if (a.equals("square"))
        {
            b = Double.parseDouble(scanner.nextLine());
            sum = b * b;
        }
        else if (a.equals("rectangle"))
        {
            b = Double.parseDouble(scanner.nextLine());
            c = Double.parseDouble(scanner.nextLine());
            sum = b * c;
        }
        else if (a.equals("circle"))
        {
            b = Double.parseDouble(scanner.nextLine());
            sum = b * b * Math.PI;
        }
        else if (a.equals("triangle"))
        {
            b = Double.parseDouble(scanner.nextLine());
            c = Double.parseDouble(scanner.nextLine());
            sum = b * c / 2;
        }
        System.out.printf("%.3f", sum);



    }

}
