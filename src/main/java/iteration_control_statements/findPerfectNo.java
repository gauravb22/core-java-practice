/*This program to checks whether a given number is perfect number or not, by using for loop.*/

package iteration_control_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class findPerfectNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number to checks is a perfect no or not.");
        int num=sc.nextInt();
        if(num>=2){
            boolean flag=isPerfectOrNot(num);
            if(flag){
                System.out.println(num+" is a perfect number.");
            }
            else{
                System.out.println(num+" is not a perfect number.");
            }
        }
        else{
            System.out.println("Please Enter Greater than 1.");
        }
    }
    private static boolean isPerfectOrNot(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) {
                sum = sum + i;
            }
        }
        if(sum==num){
            return true;
        }
        else {
            return false;
        }
    }

}
