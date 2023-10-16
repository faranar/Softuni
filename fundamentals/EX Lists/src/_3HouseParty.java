import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands= Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        List<String> input = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        for (int i = 0; i < commands; i++) {
            if(input.contains("not")){
                notGoing(guests, input);
            } else {
                going(guests,input);
            }
            if(i==commands-1){
                break;
            }
            input = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }
        for (String guest : guests) {
            System.out.printf("%s\n", guest);
        }
    }
    public static void notGoing(List<String> guests, List<String> input){
        if (guests.contains(input.get(0))){
            guests.remove(input.get(0));
        }else {
            System.out.printf("%s is not in the list!\n", input.get(0));
        }
    }
    public static void going(List<String> guests, List<String> input){
        if (guests.contains(input.get(0))){
            System.out.printf("%s is already in the list!\n", input.get(0));
        }else {
            guests.add(input.get(0));
        }
    }


}
