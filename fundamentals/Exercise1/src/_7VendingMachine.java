import java.util.Scanner;

public class _7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            switch (input){
                case "0.1":
                    sum += coin;
                    break;
                case "0.2":
                    sum += coin;
                    break;
                case "0.5":
                    sum += coin;
                    break;
                case "1":
                    sum += coin;
                    break;
                case "2":
                    sum += coin;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f\n",coin);
                    break;
            }
            input = scanner.nextLine();
        }
        input=scanner.nextLine();
        while (!input.equals("End")){
            switch (input) {
                case "Nuts":
                    sum -=2;
                    if (sum<0){
                        System.out.print("Sorry, not enough money\n");
                    sum = sum + 2;

                    }
                    else{
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    sum -=0.7;
                    if (sum<0){
                        System.out.print("Sorry, not enough money\n");
                        sum = sum + 0.7;

                    }
                    else{
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    sum -=1.5;
                    if (sum<0){
                        System.out.print("Sorry, not enough money\n");
                        sum = sum + 1.5;

                    }
                    else{
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    sum -=0.8;
                    if (sum<0){
                        System.out.print("Sorry, not enough money\n");
                                sum = sum + 0.8;

                    }
                    else{
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    sum -=1;
                    if (sum<0){
                        System.out.print("Sorry, not enough money\n");
                        sum = sum + 1;

                    }
                    else{
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
