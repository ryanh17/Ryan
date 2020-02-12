package game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private Scanner scan = new Scanner(System.in);
    private String userInput = "";
    private String computerInput;
    private int userScore;
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String INVALID_INPUT = "Invalid Input";

    public RockPaperScissors(){
    }


    /**
     * Gets user input
     * Generates computer input
     * @return method that comapares user input to computer input
     */
    public String start(){
        getUserInput();
        generateComputerInput();
        return compareUserInputToComputerInput();
    }

    /**
     * Get user input using scanner and convert input to all lower case
     */
    private void getUserInput(){
        userInput = scan.nextLine().toLowerCase();
    }

    /**
     * Generate computer input using random number generator
     * If 0 set computerInput to rock, if 1 set computerInput to scissors, if 2 set computerInput to paper
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
     * @return 0 if tie game, 1 if user wins, -1 if user loses, and "Invalid Input" if input is invalid
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
        return INVALID_INPUT;
    }
}
