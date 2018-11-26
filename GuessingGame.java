package guessingame;
//Import Scanner  
import java.util.Scanner; 
  
public class GuessingGame { 

  public static void main(String[] args) { 
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      //Set initial value of Tries
      int numberOfTries = 0;
      //Create random number between 1 and 10000
      int numberToGuess = (int) (Math.random() * 10000) + 1; 
      //Create intro phrase
      System.out.print("Enter a guess between 1 and 10000: ");
      
int guess = -1;
//Set guess parameters for when guess does not equal the random number
while (guess != numberToGuess) {
    //Set guess for next input Int
    guess = input.nextInt();
    //Increase number of tries by 1 for each guess
    numberOfTries ++;
    //Set parameters for when number is successfully guessed
    if (guess == numberToGuess)
        System.out.println("You WIN. the number was: " + numberToGuess + " and it took you " + numberOfTries + " guesses. ");
    //Set parameters for when number is lower
    else if (guess > numberToGuess)
        System.out.println("Lower\n" + "Enter a guess beteeen 1 and " + guess + ": ");
    //Set final parameters for when number is higher
    else 
       System.out.println("Higher\n" + "Enter a guess between " + guess + " and 10000: ");   
    }
  }
}