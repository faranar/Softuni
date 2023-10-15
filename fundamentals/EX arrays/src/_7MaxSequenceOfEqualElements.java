
import java.util.Arrays;
import java.util.Scanner;

public class _7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        int longestSeq = 0;
        int tempSeq = 1;
        int index = 0;
        for (int i = 0; i < array.length-1; i++) {
            while (array[i] == array[i+1]){
                i++;
                tempSeq++;
                if (i == array.length -1){
                    break;
                }
            }
            if (tempSeq>longestSeq){
                longestSeq = tempSeq;
                index = i;
            }
            tempSeq = 1;
        }

        for (int i = 0; i <longestSeq ; i++) {
            System.out.print(array[index - i] + " ");
        }
    }
}
