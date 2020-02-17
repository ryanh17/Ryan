import game.RockPaperScissors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTests {
    /**
     * Testing Strategy
     *
     * Test when randomNumber: 0, 1, 2
     * Test when userInput is rock and computer input is: rock, paper, or scissors
     * Test when userInput is paper and computer input is: rock, paper, or scissors
     * Test when userInput is scissors and computer input is: rock, paper, or scissors
     * Test when userInput invalid
     */

    //covers when random number = 0, 1, 2
    @Test
    public void randomNumber() {
        assertEquals("rock", new RockPaperScissors("rock", 0).getComputerInput());
        assertEquals("paper", new RockPaperScissors("rock", 1).getComputerInput());
        assertEquals("scissors", new RockPaperScissors("rock", 2).getComputerInput());
    }

    //covers when userInput is rock and computer input is: rock, paper, or scissors
    @Test
    public void userInputRock(){
        assertEquals(0, new RockPaperScissors("rock", 0).getUserScore());
        assertEquals(-1, new RockPaperScissors("rock", 1).getUserScore());
        assertEquals(1, new RockPaperScissors("rock", 2).getUserScore());
    }

    //covers when userInput is paper and computer input is: rock, paper, or scissors
    @Test
    public void userInputPaper(){
        assertEquals(1, new RockPaperScissors("paper", 0).getUserScore());
        assertEquals(0, new RockPaperScissors("paper", 1).getUserScore());
        assertEquals(-1, new RockPaperScissors("paper", 2).getUserScore());
    }

    //covers when userInput is scissors and computer input is: rock, paper, or scissors
    @Test
    public void userInputScissors(){
        assertEquals(-1, new RockPaperScissors("scissors", 0).getUserScore());
        assertEquals(1, new RockPaperScissors("scissors", 1).getUserScore());
        assertEquals(0, new RockPaperScissors("scissors", 2).getUserScore());
    }

    //covers when userInput is invalid
    @Test
    public void userInputInvalid(){
        assertEquals("Invalid Input", new RockPaperScissors("bruh",0).getErrorMessage());
    }

}
