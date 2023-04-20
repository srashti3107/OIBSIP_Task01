import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int RandomNo = r.nextInt(100) + 1;
        int count = 0;
        while (true) {
            // Maximum NUmber of tries == 20
            if(count>=20) {
                System.out.println(" Oh No!! Game Over.....\n You have Reach the Limit  of Maximum Tries ");
                System.out.println(" Better Luck Next Time\n Don't Worry Friend\n Try Again");
                System.exit(0);
            }
            System.out.println(" Enter your guess between 1-100:");
            int playerGuess = sc.nextInt();
            count++;

            if (playerGuess == RandomNo) {
                System.out.println("!Hurray ! You Made It!! Your Guess is Right \n You win!! ");
                System.out.println("Number of tries : " + count);
                break;
            } else if (RandomNo > playerGuess) {
                System.out.println("Too Low ...PLease Guress again");

            } else {
                System.out.println("Too High... PLease Guess again");
            }
        }
        // Lower Value>>> Higher Score
        // Higher Value>>> Lowe Score
        // one Tries giver !0 points
         int score=count*10;
        System.out.println(" Your Score is "+score);

    }
}