import java.util.Scanner;
public class InputTill0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the numbers: ");
            int input =  s.nextInt();
            total = total + input;
            if ( input == 0){
                System.out.println("Sum of numbers is: " + total);
                break;
            }
        }
    }
}