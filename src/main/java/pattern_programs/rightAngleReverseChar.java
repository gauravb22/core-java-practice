/* This Program to print Right Angle Reverse Character Pattern*/

package pattern_programs;

import java.util.Scanner;

public class rightAngleReverseChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        if (n >= 1) {
            printRightAngleRevChar(n);
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static void printRightAngleRevChar(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            char temp = ch;
            for(int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp--;
            }
            ch++;
            System.out.println();
        }
    }
}