/* This Program to print Downward Right Angle Star Pattern*/

package pattern_programs;

import java.util.Scanner;

public class downwardRightAnglePattern {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number.");
        int n=sc.nextInt();
        printDownwardRightAngle(n);
    }
    private static void printDownwardRightAngle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
