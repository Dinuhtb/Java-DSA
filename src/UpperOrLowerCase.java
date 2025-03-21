import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Char: ");
        char c = s.next().charAt(0);

        if (c >= 'a' && c <= 'z'){
            System.out.println("LowerCase");
        }
        else {
            System.out.println("UpperCase");
        }
    }
}