import java.util.Scanner;

public class DataTypes {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);

    private final String GREETMESSAGE = "Data Types Options:\n1. Main Primitive Types\n2. Primitive Operators\n3. Comparable Operators";

    public DataTypes(){
        dataTypesStart();
    }

    private void dataTypesStart(){
        while(stayInControl){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();

        }
    }
}
