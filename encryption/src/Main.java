import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userChoice;
        userChoice = userInput.nextLine();
        int i = 0;
        int y = 0;
        String done = null;
        ArrayList encrypted = new ArrayList();
        ArrayList unencrypted = new ArrayList();
        while(i < userChoice.length()){
            char x = userChoice.charAt(i);
            i++;
            int k = (int) x;
            encrypted.add(k);
        }
        System.out.println(encrypted);

        while(y < encrypted.size()){
            Object num = encrypted.get(y);
            String r = Character.toString((char)(int)num);
            unencrypted.add(r);
            done = unencrypted.toString().replaceAll("[\\[\\],\\s]", "");
            y++;
        }
        System.out.println(done);
    }
}
