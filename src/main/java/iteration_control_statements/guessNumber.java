/*The Program To accept a digit(0-9) as input, then generate a random
* digit(0-9) and Check for both digit are matched or not.*/

package iteration_control_statements;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a number ");
            num=sc.nextInt();
        }
        while (num<0||num>9);
        //Generate a random number.
        int randomNumber=new Random().nextInt(10);
                if(num==randomNumber){
                    System.out.println("Your number"+num);
                    System.out.println("Random number"+ randomNumber);
                    System.out.println("You won lottery");
                }
                else {
                    System.out.println("Random number"+randomNumber);
                    System.out.println("You lost lottery");
                }
    }
}
