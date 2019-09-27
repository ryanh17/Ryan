import java.util.ArrayList;
import java.util.Scanner;

public class ControlFlow {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Messages
    private final String GREETMESSAGE = "Control Flow Options:\n1. if/else if/ else statements\n2. while loop, for loops\n3. switch statement\n0. exit to main menu";
    private final String IFSTATEMENTS = "If statements are used in java to let the system make decisions.  It creates branching programs.  If statements are based on booleans.  If the condition is true then the block of code will execute.  If the statement is false the block of code will be skipped over and the program continues to run.  ";
    private final String IFSTATEMENTSEXAMPLE = "Example:\nif(condition){\n\tblock of code\n}";
    private final String ELSEIF = "Else if runs if it's set condition is true, and if the first \"if statement\" was false. You can have multiple else if statements.";
    private final String ELSE = "Else will run if the \"if statement\" and \"else if\" statements were false. Runs no matter what, no conditions.";
    private final String WHILELOOPS = "While loops are used to continuously loop through a block of code as long as the condition for the while loop remains true.";
    private final String FORLOOPS = "For loops are similar to while loops, but they have a different purpose. To use a for loop you need to have 3 conditions. First condition is for initiating the variable/int, second condition tells the variable/int when to stop inc/dec, and the third condition tells the variable/int to inc/dec. So, as long as the second condition is true, the for loop will continue to inc/dec the var/int and run the block of code below.";
    private final String FORLOOPSEXAMPLES = "For loops are useful for running through index positions and here is an example: \n for(int i = 0; i<ArrayList.size; i++){\n\tArrayList.get(i)\n}\nThis for loop gets the data in the ArrayList at position \"i\".";
    private final String SWITCH = "A switch in java is like a long if/else-if loop. However, a switch loops through something called cases. A case is just an integer, and if that integer matches the integer in the condition given to the switch's parameters; then the block of code for that case will run. Also, you need to type \"break;\" to end the case.";
    private final String SWITCHEXAMPLE = "An example of switch would be:\n switch(userChosenInt){\n\t case 0:\n\t\t System.out.println(\"hi\");\n\t\tbreak;\n}";

    public ControlFlow() {
        controlFlowStart();
    }

    private void controlFlowStart(){
        while(stayInControl){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInControl = false;
                    break;
                case 1:
                    printIfMessages();
                    break;
                case 2:
                    printWhile_ForLoopsMessages();
                    break;
                case 3:
                    printSwitchMessages();
                    break;
            }
        }
    }

    private void printIfMessages(){
        System.out.println(IFSTATEMENTS);
        System.out.println(IFSTATEMENTSEXAMPLE);
        System.out.println(ELSEIF + "\n" + ELSE);
    }

    private void printWhile_ForLoopsMessages(){
        System.out.println(WHILELOOPS + "\n" + FORLOOPS);
        System.out.println(FORLOOPSEXAMPLES);
    }

    private void printSwitchMessages(){
        System.out.println(SWITCH);
        System.out.println(SWITCHEXAMPLE);
    }


}
