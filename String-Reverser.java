import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to revers it : ");
        String original = sc.nextLine();
        String reverse = "";

        for (int i=0; i < original.length() ; i++) {
            reverse = original.charAt(i) + reverse;
            System.out.println(reverse);
        }
        System.out.println(reverse);
    }
}
