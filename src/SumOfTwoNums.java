import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float input1 = s.nextFloat();
        System.out.print("Enter num2: ");
        float input2  = s.nextFloat();

        float sum  = input1 + input2;

        System.out.println("Sum = " + sum);
    }
}