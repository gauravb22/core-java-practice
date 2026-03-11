/*This program to swap two numbers without using a temporary variable.*/

package pattern_programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter secound number");
        int b=sc.nextInt();
        swapedNum(a,b);
    }
    private static void swapedNum(int a,int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

