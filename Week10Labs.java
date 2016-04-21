package week10labs;
import java.util.Scanner;

public class Week10Labs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a maximum number value: ");
        int high = input.nextInt();
        RandomNumber r = new RandomNumber(high);
        int randomNum = r.GetANumber();
        
        System.out.print("Ok! Now I'm thinking of a number between 1 and " + high 
                + ". What is it? ");
        int guess = input.nextInt();
        
        if (guess == randomNum) {
            System.out.print("Congrats, you guessed it. The correct number is" + randomNum);
        } 
        else if (guess > randomNum) {
            System.out.println("Your number is too large. I was thinking of " + randomNum);
        } 
        else {
            System.out.println("Your number is too small. I was thinking of " + randomNum);
        }

    }

}