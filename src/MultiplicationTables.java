import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = s.nextInt();

        int mul = 1;
        while(mul <= 10){
            int ans  = input * mul;
            System.out.println(input + " * " + mul + " = " + ans);
            mul++;
        }
    }
}