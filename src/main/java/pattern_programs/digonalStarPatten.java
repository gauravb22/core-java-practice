/*This program to print Digonal Star Pattern.*/

package pattern_programs;

import java.util.Scanner;

public class digonalStarPatten {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number.");
            int n = sc.nextInt();
            if (n >= 1) {
                printDigonalStarPattern(n);
            } else {
                System.out.println("Invalid Input");
            }
        }
        private static void printDigonalStarPattern(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++) {
                    if(i==j||i+j==n+1) {
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
