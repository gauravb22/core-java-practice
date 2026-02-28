/* This Program to Print the Fibonacci Series of N terms, by using for loop. */
package iteration_control_statements;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num= sc.nextInt();
        if(num>=1){
           printFibonacci(num);
        }
        else{
            System.out.println("Enter valid number.");
        }
    }
    private static void printFibonacci(int num){
        int first=0; int second=1;
        if(num==1){
            System.out.print(first);
        }
        else if(num==2) {
            System.out.print(first+" "+second);
        }
        else{
            System.out.println("Fibonacci series for "+num+" is:");
            System.out.print(first+" "+second);
            for(int i=3;i<=num;i++){
                int next=first+second;
                System.out.print(" "+next);
                first=second;
                second=next;
            }
        }
    }

}
