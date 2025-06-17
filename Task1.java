import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        Random random=new Random();
        int MaxAttempt=7;                // max attempts
        int score =0;                    // initial score
        boolean playagain=true;          // to play again

        while(playagain)
        {
            int attemptleft=MaxAttempt;
            int targetNumber=random.nextInt(100)+1;     // generated number for next 5 moves
            System.out.println("Welcome to the Number Guessing Game");
            playagain=false;                                  // assume that user don't want to play
            System.out.println("Think about any number between 1 to 100");
            System.out.println("You have "+ attemptleft +  " attempts to get right guess");

            while(attemptleft>0){ //loop for each round
                int guess=0;
                boolean validinput=false;
                // to check if the input is valid or not
                while(!validinput) {
                    System.out.println("Enter your guess");
                    try {
                        guess = in.nextInt();
                        validinput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a valid inout");
                        in.next();
                    }
                }
                if(guess<1 || guess>100) // condition of input number is greater than 100 or less than 1
                {
                    System.out.println("The number should be in range 1 to 100");
                    continue;
                }
                attemptleft--;
                if(guess==targetNumber) //user input is same as generated
                {
                    System.out.println("You guess it right ");
                    score++;
                    break;
                }
                else if(guess <targetNumber)
                {
                    System.out.println("Too Low");
                }
                else
                {
                    System.out.println("Too High");
                }

                if (attemptleft>0) // attempt over
                {
                    System.out.println("Attempt Left "+attemptleft);
                }
                else
                {
                    System.out.println("Run out of attempts. The number was "+targetNumber);
                }
            }
            System.out.println("Do you want to play again");
            System.out.println("Yes/No ?");
            String answer=in.next();
            if(answer.equalsIgnoreCase("yes")) // to play again
            {
                playagain=true;
            }
        }
        System.out.println("Game over. Yours score is "+score); // final score
        System.out.println("Thanks for playing");
    }
}
