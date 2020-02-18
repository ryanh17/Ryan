package game;

import java.util.Random;
import java.util.Scanner;

/**
 *This class is a foundation for creating the game Rock Paper Scissors.
 * Start method gets user input and generates computer input, then compares input to determine winner.
 * Start method returns 0 if tie game, 1 if user wins, -1 if user loses, and "Invalid Input" if input is invalid
 */

public class RockPaperScissors {
    private Scanner scan = new Scanner(System.in);
    private String userInput;
    private int randomNumber = new Random().nextInt(3);
    private String computerInput;
    private int userScore;
    private String errorMessage;
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String INVALID_INPUT = "Invalid Input";

    public RockPaperScissors(){
    }

    public RockPaperScissors(String userInput, int randomNumber){
        this.userInput = userInput;
        this.randomNumber = randomNumber;
        generateComputerInput();
        compareUserInputToComputerInput();
    }


    /**
     * Gets user input
     * Generates computer input
     * @return method that compares user input to computer input
     *          (0 if tie game, 1 if user wins, -1 if user loses, and "Invalid Input" if input is invalid)
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
     * Use randomNumber to determine computerInput
     *      (randomNumber is a randomly generated integer between 0-2)
     * If 0 set computerInput to rock, if 1 set computerInput to scissors, if 2 set computerInput to paper
     */
    private void generateComputerInput(){
        switch(randomNumber){
            case 0:
                computerInput = ROCK;
                break;
            case 1:
                computerInput = PAPER;
                break;
            case 2:
                computerInput = SCISSORS;
                break;
        }
    }

    /**
     *Compares user and computer choices
     *
     * rock beats scissors
     * scissors beats paper
     * paper beats rock
     *
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
        }else if(userInput.equals(PAPER) && computerInput.equals(SCISSORS)){
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
        }else{
            errorMessage = INVALID_INPUT;
        }
        return errorMessage;
    }

    /**
     * Gets computer choice
     * @return rock, paper, or scissors depending on what computer randomly chose
     */
    public String getComputerInput() {
        return computerInput;
    }

    /**
     * Gets user score
     * @return 0 if tie game, 1 if user wins, -1 if user loses, and "Invalid Input" if input is invalid
     */
    public int getUserScore() {
        return userScore;
    }

    /**
     * Gets error message
     * @return error message if invalid input occurred
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}
