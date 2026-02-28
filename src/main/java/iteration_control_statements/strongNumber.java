/* This program to find Strong Number, using while loop.
*  If the sum of the factorials of each digit of a number
*  is equal to the same number then  it is called strong number.
* ex- num=145
*     sum= 1! + 4! + 5!
*        = 1  + 24 + 120
*        =145 (145 is a strong number)
* */

package iteration_control_statements;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your number.");
        int num=sc.nextInt();
        boolean flag=checkStrongNum(num);
        if(flag)
            System.out.println(num+" is a strong number.");
        else
            System.out.println(num+" is not a strong number.");
    }
    private static boolean checkStrongNum(int num){
        int sum=0;
        int temp=num;
        while (temp!=0){
            int lastdigit= temp%10;
            sum=sum+findfact(lastdigit);
            temp=temp/10;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
    private static int findfact(int lastdigit){
        int fact=1;
        for(int i=1;i<=lastdigit;i++)
            fact=fact*i;
        return fact;
    }

}
