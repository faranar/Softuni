import java.util.Scanner;

public class _1PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean special = false;
        double price = 0.0;
        double totalPrice = 0.0;
        while (true){
            if (input.equals("special")){
                special = true;
                break;
            }
            if (input.equals("regular")){
                break;
            }
             price = Double.parseDouble(input);
            if (price <= 0){
                System.out.println("Invalid price!");
            }else {
                totalPrice+=price;
            }
            input = scanner.nextLine();

        }
        if (totalPrice == 0){
            System.out.println("Invalid order!");
        }else{
            double taxes = totalPrice*0.2;
            double multiplier = 1;
            if(special){
                multiplier = 0.9;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", totalPrice);
            System.out.printf("Taxes: %.2f$\n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", (totalPrice + taxes)*multiplier);
        }

    }
}
