import java.util.Scanner;

public class _2MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dungeon = scanner.nextLine().split("\\|");
        int maxHealth = 100;
        int currentHealth = maxHealth;
        int bitcoins = 0;
        for (int i = 0; i < dungeon.length; i++) {
            String[] room = dungeon[i].split(" ");
            if (room[0].equals("potion")){
                if(maxHealth-Integer.parseInt(room[1]) < currentHealth){
                    System.out.printf("You healed for %d hp.\n", maxHealth-currentHealth);
                    currentHealth = maxHealth;
                }else {
                    currentHealth +=Integer.parseInt(room[1]);
                    System.out.printf("You healed for %d hp.\n", Integer.parseInt(room[1]));
                }
                System.out.printf("Current health: %d hp.\n", currentHealth);
            } else if (room[0].equals("chest")) {
                System.out.printf("You found %d bitcoins.\n", Integer.parseInt(room[1]));
                bitcoins += Integer.parseInt(room[1]);
            } else {
                currentHealth -= Integer.parseInt(room[1]);
                if (currentHealth > 0){
                    System.out.printf("You slayed %s.\n", room[0]);
                }else {
                    System.out.printf("You died! Killed by %s.\n", room[0]);
                    System.out.printf("Best room: %d\n", i+1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", bitcoins);
        System.out.printf("Health: %d\n", currentHealth);
    }
}
