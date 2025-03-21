import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int a = 0;
        while(n > 0){
            int rem =  n % 10;
            n = n/10;
            a = a * 10 + rem;
        }
        System.out.print("The Reverse is: " + a);
    }
}
