
/*
* To guess a random number between 1-10
*/
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // create random object
        Random random = new Random();
        int from = 1;
        int to = 10;
        int randomNumber = random.nextInt(to - from + 1) + from;
        // initialize guess number
        int guessedNumber = 0;
 
        // print guess guess intro message
        System.out.printf("The number is between %d and %d.\n", from, to);
        
        //check user input and print output message based on user guessed number
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
        scan.close();
    }
} 
