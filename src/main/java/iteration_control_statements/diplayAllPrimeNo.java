/*Display all the Prime Number between the given two numbers */
package iteration_control_statements;

import java.util.Scanner;

public class diplayAllPrimeNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first Number");
        int x= sc.nextInt();
        System.out.println("Enter your second Number");
        int y= sc.nextInt();
        printAllPrime(x,y);
    }
    private static void printAllPrime(int x,int y){
      for(int i=x;i<=y;i++)  {
          int count=2;
          for(int j=2;j<=Math.sqrt(i);j++){
              if(i%j==0){
                  count++;
                  break;
              }
          }
          if(count==2){
              System.out.print(i+" ");
          }
      }
    }
}
