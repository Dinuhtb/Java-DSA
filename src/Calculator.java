import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans = 0;
        int num1 = 0;
        int num2 = 0;
        while (true) {
            System.out.print("Enter the Operator Task = ");
            char c = s.next().trim().charAt(0);

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                System.out.print("Enter the First Number: ");
                num1 = s.nextInt();
                System.out.print("Enter the Second Number: ");
                num2 = s.nextInt();

                if (c == '+') {
                    ans = num1 + num2;
                }
                if (c == '-') {
                    ans = num1 - num2;
                }
                if (c == '*') {
                    ans = num1 * num2;
                }
                if (c == '/') {
                    ans = num1 / num2;
                }
                if (c == '%') {
                    ans = num1 % num2;
                }
            } else if (c == 'x' || c == 'X') {
                System.out.println("Program Exit");
                break;
            } else {
                System.out.println("Invalid Operator Found");
                continue;
            }
            System.out.printf(" %d %c %d = %d \n\n" , num1, c, num2, ans);
        }
    }
}
