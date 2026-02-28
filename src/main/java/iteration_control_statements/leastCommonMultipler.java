/* This Program to find Least Common Mutiplier(LCM). */
package iteration_control_statements;

import java.util.Scanner;

public class leastCommonMultipler {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number.");
        int a=sc.nextInt();
        System.out.println("Enter second Number.");
        int b=sc.nextInt();
        int gcd=findGcd(a,b);
        int lcm=(a*b)/gcd;
        System.out.println("LCM: "+lcm);
    }
    private static int findGcd(int a,int b){
        if(a==b){
            return a;
        }
        else{
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
        }
    }


}
