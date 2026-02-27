/*This Program to Check whether a given number is prime or not by using for loop. */

package iteration_control_statements;
import java.util.Scanner;

public class isPrimeOrNot {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number to check is prime or not");
        int n=sc.nextInt();
        if(n>=2) {
            boolean flag = primeNotPrime(n);
            if(flag == true) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
        else{
            System.out.println("Please enter number Greater then 2.");
        }
    }
    private static boolean primeNotPrime(int n){
        int count=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                count++;
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
}
