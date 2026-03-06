/* This Program to print Right Angle Star Pattern*/
package pattern_programs;

import java.util.Scanner;

public class rightAngleCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        if (n >= 1) {
            printRightAngleCharPattern(n);
        } else {
            System.out.println("Invalid Input");
        }
    }
    private static void printRightAngleCharPattern(int n){
        for (int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
