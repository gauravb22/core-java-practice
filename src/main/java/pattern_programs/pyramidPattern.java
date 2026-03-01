/*This program to print Pyramid Star Pattern.*/
package pattern_programs;

import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        printPyramidPatternt(n);
    }

    private static void printPyramidPatternt(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            //for star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}