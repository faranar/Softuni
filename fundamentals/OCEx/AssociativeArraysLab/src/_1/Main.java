package _1;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Double, Integer> numCount = new TreeMap<>();

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        for (double num : nums) {
            if (numCount.containsKey(num)){
                numCount.put(num, numCount.get(num) + 1);
            }else {
                numCount.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> kvp : numCount.entrySet()){
            String keyFormat = new DecimalFormat("#.####").format(kvp.getKey());
            System.out.printf("%s -> %d\n", keyFormat, kvp.getValue());
        }

    }
}
