package Students_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            Double grade = Double.parseDouble(input.split(" ")[2]);
            Student student = new Student(firstName,lastName, grade);
            students.add(student);
        }
        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
        for(Student student: students){
            System.out.printf("%s %s: %.2f\n",student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
