import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = s.nextInt();

        if (year % 4 == 0){
            System.out.println("leap year");
        }
        else
            System.out.println("Not a leap year");

    }
}