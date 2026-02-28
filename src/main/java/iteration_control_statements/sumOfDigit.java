/* This Program to Find the Sum of digits of a given number, by using while loop. */

package iteration_control_statements;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Digit to Find Sum");
        int num=sc.nextInt();
        int sum=findSumOfDigit(num);
        System.out.println("Sum of "+num+" is: "+sum);
    }
    private static int findSumOfDigit(int num){
        int sum=0;
        while (num!=0){
            int lastdigit=num%10;
            sum+=lastdigit;
            num=num/10;
        }
        return sum;
    }
    

}
