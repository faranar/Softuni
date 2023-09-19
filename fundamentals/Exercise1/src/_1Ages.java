import java.util.Scanner;

public class _1Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String personAge = "";
        if (age >=0 && age<=2) {
            personAge = "baby";
        } else if (age >2 && age<=13) {
            personAge = "child";
        } else if (age >13 && age<=19) {
            personAge = "teenager";
        } else if (age >19 && age<=65) {
            personAge = "adult";
        } else if (age >=66) {
            personAge = "elder";
        }
        System.out.println(personAge);
    }
}
