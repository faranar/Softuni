import java.util.Scanner;

public class _3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double price = 0;
        double priceTotal = 0;
        switch (groupType){
            case "Students":
                if (weekDay.equals("Friday")){
                    price = 8.45;
                }else if (weekDay.equals("Saturday")){
                    price = 9.8;
                }else if (weekDay.equals("Sunday")) {
                    price = 10.46;
                }
                if (groupSize >= 30) {
                    priceTotal = price * groupSize * 0.85;
                }
                else{
                    priceTotal = price*groupSize;
                }
                break;
            case "Business":
                if (weekDay.equals("Friday")){
                    price = 10.9;
                }else if (weekDay.equals("Saturday")){
                    price = 15.6;
                }else if (weekDay.equals("Sunday")) {
                    price = 16;
                }
                if (groupSize < 100) {
                    priceTotal = price * groupSize;
                }
                else{
                    priceTotal = price * (groupSize - 10);
                }
                break;
            case "Regular":
                if (weekDay.equals("Friday")){
                    price = 15;
                }else if (weekDay.equals("Saturday")){
                    price = 20;
                }else if (weekDay.equals("Sunday")) {
                    price = 22.5;
                }
                if (groupSize >= 10 && groupSize <= 20) {
                    priceTotal = price * groupSize * 0.95;
                }
                else{
                    priceTotal = price*groupSize;
                }
                break;
        }
        System.out.printf("Total price: %.2f", priceTotal);
    }
}
