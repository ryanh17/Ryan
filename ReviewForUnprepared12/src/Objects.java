import java.util.Scanner;

public class Objects {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);

    private final String GREETMESSAGE = "Objects Options:\n1. How to create a class\n2. What is a constructor\n3. What are setters and getters\n4. What is the toString method\n5. How to access data inside an object\n0. Exit to Main Menu";
    private final String HOWTOCRATEACLASS =  "To create a class, you need to create a new java class in the source folder. \nIn this new class, you need fields, constructors, and methods.";
    private final String WHATISCONSTRUCTOR = "A constructor is used to essentially setup a new object. A constructor for a class can set values for the fields of a class. You can have multiple constructors for one class, but their parameters must be different. Also, a constructor has the same name as the class.";
    private final String CONSTRUCTOREXAMPLE = "An example of a constructor being used would be:\nClassName objectName = new ClassName(25, \"Hi\");\nThis new object is using the constructor to set fields within the ClassName class. The field int was set to 15 and a string field was set to \"Hi\".";
    private final String WHATAREGETTERSANDSETTERS = "Getters and setters are public methods that are used to GET data from fields or SET data to fields. Objects of a class use these methods. Getters and setters are useful when a class's fields are private as they cannot be accessed outside of the class.";
    private final String WHATISTOSTRINGMETHOD = "The toString method is used to override the default String when you try to print an object. Default the toString method just returns the location in memory of that object. However, we can set the toString method to print whatever we want. For example we can print the fields of that object out.";
    private final String HOWTOACCESSDATAINOBJECT = "To access data inside an object, you need to use methods like getters and setters. Also, the methods must be set to public. An example of a getter being used could be in a print ln code as seen below:\nSystem.out.println(objectName.getData);";


    public Objects(){
        objectsStarts();
    }

    private void objectsStarts() {
        while (stayInControl) {
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 0:
                    stayInControl = false;
                    break;
                case 1:
                    printHowToCreateAClass();
                    break;
                case 2:
                    printWhatIsAConstructor();
                    break;
                case 3:
                    printGettersAndSetters();
                    break;
                case 4:
                    printToStringMethod();
                    break;
                case 5:
                    printHowToAccessData();
                    break;
            }
        }
    }

    private void printHowToCreateAClass() {
        System.out.println(HOWTOCRATEACLASS);
    }
    private void printWhatIsAConstructor(){
        System.out.println(WHATISCONSTRUCTOR);
        System.out.println(CONSTRUCTOREXAMPLE);
    }
    private void printGettersAndSetters(){
        System.out.println(WHATAREGETTERSANDSETTERS);
    }
    private void printToStringMethod(){
        System.out.println(WHATISTOSTRINGMETHOD);
    }
    private void printHowToAccessData(){
        System.out.println(HOWTOACCESSDATAINOBJECT);
    }
}
