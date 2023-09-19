import java.util.Scanner;

public class _10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        double lightSaber = Math.ceil(students*1.1);
        int belt = students - students/6;
        double sum = priceLightSaber*lightSaber + priceBelt*belt + priceRobes*students;
        double diff = money - sum;
        if (diff >= 0){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(diff));
        }

    }
}
