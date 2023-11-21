import java.util.Scanner;
import java.util.random;

public class NumGuessGame
{
    static void nGuessGame()
    {
        //Scanner class
        Scanner sc=new Scanner(System.in);

        //function to generate random numbers
        int number=1+(int)(100*Math.random());

        //for given n trails
        int n=5;
        int i,guess;

        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You have Maximum 5 Attempt Limit");

        //Iterate over n trails
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a guess number between 1 to 100");

            //Taking input for guessing
            guess=sc.nextInt();

            //If the number is guessed
            if(number==guess)
            {
                System.out.println("OOhOO!, Your Number is Correct.You Win the Game!");
                break;
            }

            else if(number>guess && i!=n-1)
            {
                System.out.println("Your Guess Number is Greater");
            }

            else if(number<guess && i!=n-1)
            {
                System.out.println("Your Guess Number is Smaller");
            }
        }

        if(i==n)
        {
            System.out.println("You have completed"+n+"trails.");
            System.out.println("The number was:"+number);
        }

    }
    public static void main(String args[])
    {
        //Function Call
        nGuessGame();
    }
}