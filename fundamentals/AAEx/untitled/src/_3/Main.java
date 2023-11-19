package _3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<Double>> products = new LinkedHashMap<>();
        while (true){
            String[] input = scanner.nextLine().split(" ");
            if (input[0].contains("buy")){
                break;
            }
            double price = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);
            if (!products.containsKey(input[0])){
                products.put(input[0],new ArrayList<>() );
                products.get(input[0]).add(0, price);
                products.get(input[0]).add(1, quantity);
            }else {
                products.get(input[0]).set(0, price);
                products.get(input[0]).set(1, products.get(input[0]).get(1) + quantity);
            }
        }
        products
                .entrySet()
                .forEach(e-> System.out.printf("%s -> %.2f\n",
                        e.getKey(),
                        e.getValue().get(0) * e.getValue().get(1)));

    }
}
