import java.util.*;
import java.util.stream.Collectors;

public class _7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> arrays = Arrays.stream(input.split("\\|")).
                collect(Collectors.toList());
        Collections.reverse(arrays);
        System.out.println(arrays.toString()
                .replace("[", "")
                .replace("]","")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));


    }
}
