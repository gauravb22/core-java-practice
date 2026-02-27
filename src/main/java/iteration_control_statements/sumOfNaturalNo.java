/*This Program to find Sum of N Natural Number using for Loop*/
package iteration_control_statements;

import java.util.Scanner;

public class sumOfNaturalNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n= sc.nextInt();
        int sum=findSum(n);
        System.out.println("Sum of"+n+" natural Number is: "+sum);
    }
    private static int findSum(int n){
        int sum=0;
        for(int i =0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

}
