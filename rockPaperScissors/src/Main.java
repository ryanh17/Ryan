import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //creates random number generator
        Scanner userInput = new Scanner(System.in);
        //creates scanner for user input
        System.out.println("Rock, Paper, Scissors");
        //title
        String userChoice = userInput.nextLine();
        //gets input from user from next line
        int randomNum = random.nextInt(3);
        //computer chooses number from 3 different number and stores in randomNum
        String computerChoice;
        //creates variable computerChoice

        if (randomNum == 1){
            computerChoice = "rock";
        }else if (randomNum == 2){
            computerChoice = "paper";
        }else {
            computerChoice = "scissors";
        }

        if(userChoice == computerChoice){
            System.out.println("Tie, you both chose " + userChoice);
        }else if(userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You won, the computer chose " + computerChoice);
        }else if(userChoice.equals("scissors") && computerChoice.equals("rock")){
            System.out.println("You lost, the computer chose " + computerChoice);
        }else if(userChoice.equals("paper") && computerChoice.equals("rock")){
            System.out.println("You win, the computer chose " + computerChoice);
        }else if(userChoice.equals("paper") && computerChoice.equals("scissors")){
            System.out.println("You lost, the computer chose " + computerChoice);
        }else if(userChoice.equals("rock") && computerChoice.equals("scissors")){
            System.out.println("You won, the computer chose " + computerChoice);
        }else if(userChoice.equals("rock") && computerChoice.equals("paper")){
            System.out.println("You lost, the computer chose " + computerChoice);
        }
    }
}
