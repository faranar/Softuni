import java.util.Scanner;

public class _3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int range = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double extra = 0;
        if(weight<1) {
            price = 0.03;
            if (type.equals("express")){
                extra = 0.8*price*weight;
            }
        }
        else if(weight<10) {
            price = 0.05;
            if (type.equals("express")){
                extra = 0.4*price*weight;
            }
        }
        else if(weight<40) {
            price = 0.1;
            if (type.equals("express")){
                extra = 0.05*price*weight;
            }
        }
        else if(weight<90) {
            price = 0.15;
            if (type.equals("express")){
                extra = 0.02*price*weight;
            }
        }
        else if(weight<150) {
            price = 0.20;
            if (type.equals("express")){
                extra = 0.01*price*weight;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, (price+extra)*range);



    }
}
