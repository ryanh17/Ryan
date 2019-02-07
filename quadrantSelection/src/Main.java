import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int inputX = x.nextInt();
        int inputY = x.nextInt();

        if (inputX > 0){
            if (inputY > 0){
                System.out.println(1);
            } else{
                System.out.println(4);
            }
        }

        if (inputX < 0){
            if(inputY < 0){
                System.out.println(3);
            }else{
                System.out.println(2);
            }
        }
    }
}
