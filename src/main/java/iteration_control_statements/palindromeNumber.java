/*This Program to to check Palindrome Number. using while loop.
* If the reverse of a number is equal to the same number then it is a palindrome number.*/

package iteration_control_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        if (num >= 0) {
            boolean flag = findPalindrome(num);
            if (flag) {
                System.out.println(num + " Is a Palindrome Number.");
            } else {
                System.out.println(num+" Is not a Palindrome Number.");

            }
        }
    }
    private static boolean findPalindrome(int num){
        int reverse=0;
        int temp=num;
        while(temp!=0){
            int lastdigit=temp%10;
            reverse=reverse*10+lastdigit;
            temp=temp/10;
        }
        if(num==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}