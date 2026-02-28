/* This Program to find Armstrong Number.
* If the sum of the nth power of each digit of a number is equal to the same number
* then it is called an armstrong number. */

package iteration_control_statements;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number.");
        int num = sc.nextInt();
        boolean flag = checkArmstrong(num);
        if (flag)
            System.out.println(num +" is a Armstrong number.");
        else
            System.out.println(num + " is not a Armstrong number.");
    }
    private static boolean checkArmstrong(int num){
        int sum=0;
        //convert given number into a string
        String str=String.valueOf(num);
        //find the length.
        int count=str.length();

        int temp=num;
        while(temp!=0) {
            int lastdigit = temp % 10;
            sum+=Math.pow(lastdigit,count);
            temp=temp/10;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
