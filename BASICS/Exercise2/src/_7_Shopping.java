import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double gpuPrice = 250;
        double cpuPrice = gpu * gpuPrice * 0.35;
        double ramPrice = gpu * gpuPrice * 0.1;
        double sum = (gpu * gpuPrice) + (cpu * cpuPrice) + (ram * ramPrice);
        if (gpu > cpu)
        {
            sum = sum*0.85;
        }
        double diff = Math.abs(budget - sum);
        if (sum <= budget)
        {
            System.out.printf("You have %.2f leva left!\n", diff);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva more!\n", diff);
        }



    }
}
