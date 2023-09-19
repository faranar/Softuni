import java.util.Scanner;

public class _6_Vowels_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int b = 0;
        for (int i = 0; i < text.length(); i++)
        {
            char l = text.charAt(i);
            switch (l)
            {
                case 'a':
                    b+=1;
                    break;
                case 'e':
                    b+=2;
                    break;
                case 'i':
                    b+=3;
                    break;
                case 'o':
                    b+=4;
                    break;
                case 'u':
                    b+=5;
                    break;

            }
        }
        System.out.println(b);
    }
}
