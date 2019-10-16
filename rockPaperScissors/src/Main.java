import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //creates scanner for user input
        String userChoice = null;
        //stores user input
        int userScore = 0;
        //stores user score
        int computerScore = 0;
        //stores computer score

        do { //runs all of this
            System.out.println("Rock, Paper, Scissors");
            System.out.println("Please type \"rock\", \"paper\", \"scissors\" or \"exit\"");
            System.out.println("User: " + userScore +"\tComputer: " + computerScore);
            System.out.println("--------------------------------------------");
            //title, instructions and score
            userChoice = userInput.nextLine().toLowerCase();
            //gets user input from next line and makes all lowercase
            Random random = new Random();
            //creates random number generator
            int randomNum = random.nextInt(3);
            //computer chooses number from 3 different number and stores in randomNum
            String computerChoice;
            //creates variable computerChoice

            if (randomNum == 1) {
                computerChoice = "rock";
            } else if (randomNum == 2) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            } //sets each random number generated to a string

            if((!userChoice.equals("paper"))&&(!userChoice.equals("rock")) && (!userChoice.equals("scissors")) && (!userChoice.equals("exit"))){
                System.out.println("  ");
            } //runs if user doesn't type rock, paper, scissors or exit

            //compares selections and chooses who wins, also adds to their score
            if (userChoice.equals(computerChoice)) {
                System.out.println("Tie, you both chose " + userChoice);
                userScore++;
                computerScore++;
            } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You won, the computer chose " + computerChoice);
                userScore++;
            } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
                System.out.println("You lost, the computer chose " + computerChoice);
                computerScore++;
            } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win, the computer chose " + computerChoice);
                userScore++;
            } else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
                System.out.println("You lost, the computer chose " + computerChoice);
                computerScore++;
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You won, the computer chose " + computerChoice);
                userScore++;
            } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("You lost, the computer chose " + computerChoice);
                computerScore++;
            }
        }while(!userChoice.equals("exit")); //if user doesn't type exit re-run loop
    }
}
