/*This program to print Dimond Star Pattern.*/

package pattern_programs;

import java.util.Scanner;

public class dimondPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        if(n>=1){
            printDimondPatternt(n);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    private static void printDimondPatternt(int n) {
        //For top half
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
        //For bottom half
        for(int i=1;i<=n-1;i++){
            //for spaces
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=1;k<=2*(n-i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}