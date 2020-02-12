package game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private Scanner scan = new Scanner(System.in);
    private String userInput = "";
    private String computerInput;
    private int computerScore;
    private int userScore;
    private static String ROCK = "rock";
    private static String PAPER = "paper";
    private static String SCISSORS = "scissors";
    private static String INVALIDINPUT = "Invalid Input";
    private static String GREETINGMESSAGE = "Welcome to Rock Paper Scissors. Type \"rock\", \"paper\", or \"scissors\"";

    public RockPaperScissors(){
    }

    public String start(){
        getUserInput();
        generateComputerInput();
        return compareUserInputToComputerInput();
    }

    private String getGreetingMessage(){
        return GREETINGMESSAGE;
    }

    private void getUserInput(){
        userInput = scan.nextLine().toLowerCase();
    }

    /**
     * Generate computer input using random number generator
     */
    private void generateComputerInput(){
        int computerNumber = new Random().nextInt(3);
        switch(computerNumber){
            case 0:
                computerInput = ROCK;
                break;
            case 1:
                computerInput = SCISSORS;
                break;
            case 2:
                computerInput = PAPER;
                break;
        }
    }

    /**
     *Compares user and computer choices
     * @return 0 if tie game, 1 if user wins, -1 if user loses
     */
    private String compareUserInputToComputerInput(){
        if(userInput.equals(computerInput)){
            return Integer.toString(0);
        }else if(userInput.equals(ROCK) && computerInput.equals(SCISSORS)){
            userScore++;
            return Integer.toString(userScore);
        }else if(userInput.equals(ROCK) && computerInput.equals(PAPER)){
            userScore--;
            return Integer.toString(userScore);
        }else if(userInput.equals(ROCK) && computerInput.equals(SCISSORS)){
            userScore--;
            return Integer.toString(userScore);
        }else if(userInput.equals(PAPER) && computerInput.equals(ROCK)){
            userScore++;
            return Integer.toString(userScore);
        }else if(userInput.equals(SCISSORS) && computerInput.equals(ROCK)){
            userScore--;
            return Integer.toString(userScore);
        }else if(userInput.equals(SCISSORS) && computerInput.equals(PAPER)){
            userScore++;
            return Integer.toString(userScore);
        }
        return INVALIDINPUT;
    }



    /**
     * method containing losing message
     * @return losing message
     */
    private String userLosingMessage(){
        return "You lost, computer chose " + computerInput;
    }

    /**
     * method containing winning message
     * @return winning message
     */
    private String userWinningMessage(){
        return "You won, computer chose " + computerInput;
    }

    /**
     * method containing tie game message
     * @return tie message
     */
    private String tieGameMessage(){
        return "Tie game, you both chose " + userInput;
    }

    public String getResults() {
        return compareUserInputToComputerInput() +". Your score: " + userScore + " Computer score: " + computerScore;
    }
}
