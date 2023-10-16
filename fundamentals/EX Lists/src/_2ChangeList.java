import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")){
            if(input[0].equals("Delete")){
                delete(input[1], list);
            } else if (input[0].equals("Insert")) {
                insert(input[1], input[2], list);
            }
            input = scanner.nextLine().split(" ");
        }
        for (Integer integer : list) {
            System.out.printf("%d ", integer);
        }
    }

    public static void delete(String num, List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Integer.parseInt(num)){
                list.remove(i);
            }
        }
    }
    public static void insert(String num, String position, List<Integer> list){
        list.add(Integer.parseInt(position), Integer.parseInt(num));
    }

}
