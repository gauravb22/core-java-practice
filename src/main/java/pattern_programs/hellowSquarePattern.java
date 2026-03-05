/*This program to print Hellow Square Star Pattern.*/

package pattern_programs;

import java.util.Scanner;

public class hellowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        if (n >= 1) {
            printHellowSquarePattern(n);
        } else {
            System.out.println("Invalid Input");
        }
    }
    private static void printHellowSquarePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if(i==1||i==n||j==1||j==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
