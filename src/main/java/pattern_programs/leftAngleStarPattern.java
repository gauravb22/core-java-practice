/* This Program to print Left Angle Star Pattern*/

package pattern_programs;

import java.util.Scanner;

public class leftAngleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        printLeftAngle(n);
    }
    private static void printLeftAngle(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= 2*(n-i);j++) {
                System.out.print(" ");
            }
            //for star *
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}