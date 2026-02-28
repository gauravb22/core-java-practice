/*This Program to Find the sum of even digits and odd digits
 in a given number separately, by using while loop. */

package iteration_control_statements;

import java.util.Scanner;

public class sumOfEvenAndOddDigits {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Digits.");
        int num=sc.nextInt();
        evenOddSum(num);
    }
    private static void evenOddSum(int num){
        int evenNum=0; int oddNum=0;
        while(num!=0){
            int lastdigit=num%10;
            if(lastdigit%2==0){
                evenNum+=lastdigit;
            }
            else {
                oddNum+=lastdigit;
            }
            num=num/10;
        }
        System.out.println("Sum of even Digits is: "+ evenNum);
        System.out.println("Sum of odd Digits is: "+ oddNum);
    }

}
