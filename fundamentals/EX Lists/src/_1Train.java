import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<Integer> wagons = Arrays.stream(scanner.nextLine()
                 .split(" "))
                 .map(Integer::parseInt)
                 .collect(Collectors.toList());
         int maxCapacity = Integer.parseInt(scanner.nextLine());
         String[] input = scanner.nextLine().split(" ");
         while (!input[0].equals("end")){
             if(input[0].equals("Add")){
                 addWagon(input[1], wagons);
             }
             else {
                 addPassengers(input[0], wagons, maxCapacity);
             }
             input = scanner.nextLine().split(" ");
         }
        for (Integer wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
    }
    public static void addWagon(String newWagon, List<Integer> wagons){
        wagons.add(Integer.parseInt(newWagon));
    }
    public static void addPassengers(String passengers, List<Integer> wagons, int cap){
        for (int i = 0; i < wagons.size(); i++) {
            if(wagons.get(i) + Integer.parseInt(passengers) <=cap){
                wagons.set(i,wagons.get(i) + Integer.parseInt(passengers));
                break;
            }
        }
    }
}
