import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Nth Number: ");
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;

        while (c <= n){
            int temp = b;
            b = a + b;
            a = temp;
            c++;
        }
        System.out.printf("The Fibonacci of %d is: %d",n, b);
    }
}
