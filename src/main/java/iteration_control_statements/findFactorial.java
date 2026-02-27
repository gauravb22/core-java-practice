/* This Program to find Factorail of N number by using for loop.*/

package iteration_control_statements;
import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number to find factorial");
        int n = sc.nextInt();
        int fact = findfact(n);
        System.out.println("Factorial of " +n+ " is: "+fact);
    }

    private static int findfact(int n) {
        int fact = 1;
        for (int i= 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
