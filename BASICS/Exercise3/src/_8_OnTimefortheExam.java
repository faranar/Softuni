import java.util.Scanner;

public class _8_OnTimefortheExam {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hoursExam = Integer.parseInt(scanner.nextLine());
            int minutesExam = Integer.parseInt(scanner.nextLine());
            int hourOfArrival = Integer.parseInt(scanner.nextLine());
            int minuteOfArrival = Integer.parseInt(scanner.nextLine());
            int examTotalMinutes = hoursExam * 60 + minutesExam;
            int arrivalTotalMinutes = hourOfArrival * 60 + minuteOfArrival;

            int diff = Math.abs(examTotalMinutes - arrivalTotalMinutes);
            if (arrivalTotalMinutes > examTotalMinutes) {
                System.out.println("Late");
                if (diff < 60) {
                    System.out.printf("%d minutes after the start", diff);
                } else {
                    int hours = diff / 60;
                    int minutes = diff % 60;
                    System.out.printf("%d:%02d hours after the start", hours, minutes);
                }
            }else if (diff <=30) {
                System.out.println("On time");
                if (examTotalMinutes != arrivalTotalMinutes) {
                    System.out.printf("%d minutes before the start", diff);
                }
            }else{
                System.out.println("Early");
                if (diff < 60) {
                    System.out.printf("%d minutes before the start", diff);
                }else{
                    int hours =diff / 60;
                    int minutes = diff %60;
                    System.out.printf("%d: %02d hours before the start",hours,minutes);




                }
            }
        }

    }