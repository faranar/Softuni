package OpinionPoll_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> poll= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String  name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            if(age>30) {
                Person person = new Person(name, age);
                poll.add(person);
            }
        }
        for (Person person: poll) {
            System.out.printf("%s - %d\n", person.getName(), person.getAge() );
        }

    }


}
