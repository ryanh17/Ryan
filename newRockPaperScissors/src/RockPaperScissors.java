import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private Scanner scan = new Scanner(System.in);
    private String userInput = "";
    private String computerInput;
    private int computerScore;
    private int userScore;

    RockPaperScissors(){
    }

    public String start(){
        getUserInput();
        generateComputerInput();
        return compareUserInputToComputerInput() +". Your score: " + userScore + " Computer score: " + computerScore;
    }

    private void getUserInput(){
        userInput = scan.nextLine().toLowerCase();
    }

    private void generateComputerInput(){
        int computerNumber = new Random().nextInt(3);
        switch(computerNumber){
            case 0:
                computerInput = "rock";
                break;
            case 1:
                computerInput = "scissors";
                break;
            case 2:
                computerInput = "paper";
                break;
        }
    }

    private String compareUserInputToComputerInput(){
        if(userInput.equals(computerInput)){
            return "Tie game, you both chose " + userInput;
        }else if(userInput.equals("rock") && computerInput.equals("scissors")){
            userScore++;
            return "You won, computer chose " + computerInput;
        }else if(userInput.equals("rock") && computerInput.equals("paper")){
            computerScore++;
            return "You lost, computer chose " + computerInput;
        }else if(userInput.equals("paper") && computerInput.equals("scissors")){
            computerScore++;
            return "You lost, computer chose " + computerInput;
        }else if(userInput.equals("paper") && computerInput.equals("rock")){
            userScore++;
            return "You won, computer chose " + computerInput;
        }else if(userInput.equals("scissors") && computerInput.equals("rock")){
            computerScore++;
            return "You lost, computer chose " + computerInput;
        }else if(userInput.equals("scissors") && computerInput.equals("paper")){
            userScore++;
            return "You won, computer chose " + computerInput;
        }
        return "invalid input";
    }

//    public String getResults() {
//        return compareUserInputToComputerInput() +". Your score: " + userScore + " Computer score: " + computerScore;
//    }
}
