/* This Program to print Pascal Trianlge Pattern*/
package pattern_programs;

import java.util.Scanner;

public class pascalTrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();
        if (n >= 1) {
            printPascalTringle(n);
        } else {
            System.out.println("Invalid Input");
        }
    }
    private static void printPascalTringle(int n) {
        for(int i=0;i<n;i++){
            for(int s=1;s<=n-i-1;s++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                int num=factorial(i)/(factorial(j)*factorial(i-j));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    private static int factorial(int k){
        int result=1;
        for (int i=1;i<=k;i++){
            result*=i;
        }
        return result;
    }
}
