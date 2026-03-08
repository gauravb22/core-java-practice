/*The Program To accept a digit(0-9) as input, then generate a random
* digit(0-9) and Check for both digit are matched or not.*/

package iteration_control_statements;
import java.util.Random;
import java.util.Scanner;
public class guessNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter a number ");
            number=sc.nextInt();
        }
        while (number<0||number>9);
        //Generate a random number.
        int randomNumber=new Random().nextInt(10);
                if(number==randomNumber){
                    System.out.println("Your number"+number);
                    System.out.println("Random number"+ randomNumber);
                    System.out.println("You won lottery");
                }
                else {
                    System.out.println("Random number"+randomNumber);
                    System.out.println("You lost lottery");
                }
    }
}
