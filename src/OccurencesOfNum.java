import java.util.Scanner;

public class OccurencesOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int a = 0;
        while(n > 0){
            int rem =  n % 10;
            if (rem == 3){
                a++;
            }
            n = n/10;
        }
        System.out.print("The occurrence of 3 is: " + a);

    }
}
