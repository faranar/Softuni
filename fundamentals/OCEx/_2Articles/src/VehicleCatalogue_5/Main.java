package VehicleCatalogue_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalogue> vehicles = new ArrayList<>();
        int truckCount = 0;
        int carCount = 0;
        double truckHP = 0.0;
        double carHP = 0.0;

        while(true){
            String[] input = scanner.nextLine().split(" ");
            if(input[0].equals("End")){
                break;
            }
            Catalogue catalogue = new Catalogue(input[0],input[1],input[2],Integer.parseInt(input[3]));
            vehicles.add(catalogue);
            if (input[0].equals("car")){
                carCount++;
                carHP += Integer.parseInt(input[3])*1.0;
            }
            if (input[0].equals("truck")){
                truckCount++;
                truckHP += Integer.parseInt(input[3])*1.0;
            }
        }
        while (true){
            String input = scanner.nextLine();
            if (input.equals("Close the Catalogue")){
                break;
            }
            for (Catalogue catalogue: vehicles){
                if (catalogue.getModel().equals(input)){
                    catalogue.print();
                }
            }
        }
        double averageCarHP = 0;
        double averageTruckHP = 0;
        if (carCount>0){
            averageCarHP = carHP/carCount;
        }
        if (truckCount>0){
            averageTruckHP = truckHP/truckCount;
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHP);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHP);

    }
}
