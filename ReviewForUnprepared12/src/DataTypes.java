import java.util.Scanner;

public class DataTypes {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);

    private final String GREETMESSAGE = "Data Types Options:\n1. Main Primitive Types\n2. Primitive Operators\n3. Comparable Operators\n0. Exit to Main Menu";
    private final String MAINPRIMITIVETYPES = "List of main primitive types:\n- byte\n- short\n- int\n- long\n- float\n- double\n- boolean\n- char";
    private final String PRIMITIVEOPERATORS = "List of primitive operators:\n- +(plus)\n- -(minus)\n- *(multiply)\n- /(divide)\n- %(modulo-remainder)\n- ++(inc 1)\n- --(dec 1)";
    private final String COMPARABLEOPERATORS = "List of comparable operators:\n- <(less than)\n- >(greater than)\n- <=(less than or equal to)\n- >=(greater than or equal to)\n- ==(equal to)\n- !=(does not equal to)";

    public DataTypes(){
        dataTypesStart();
    }

    private void dataTypesStart(){
        while(stayInControl){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInControl = false;
                    break;
                case 1:
                    printMainPrimitiveTypes();
                    break;
                case 2:
                    printPrimitiveOperators();
                    break;
                case 3:
                    printComparableOperators();
                    break;
            }
        }
    }

    private void printMainPrimitiveTypes() {
        System.out.println(MAINPRIMITIVETYPES);
    }
    private void printPrimitiveOperators(){
        System.out.println(PRIMITIVEOPERATORS);
    }
    private void printComparableOperators(){
        System.out.println(COMPARABLEOPERATORS);
    }
}
