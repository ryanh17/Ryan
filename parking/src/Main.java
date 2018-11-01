import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int parkingSpaces = input.nextInt();
        String yesterdayParking = input.nextLine();
        String todayParking = input.nextLine();
        ArrayList yesterday = new ArrayList();
        ArrayList today = new ArrayList();
        int occupiedBothDays = 0;
        int i = 0;

        while (i < parkingSpaces){
            char y = yesterdayParking.charAt(i);
            char t = todayParking.charAt(i);
            yesterday.add(y);
            today.add(t);
            if(yesterday.get(i).equals("c") && today.get(i).equals("c")){
                occupiedBothDays++;
            }
            i++;
        }
        System.out.println(occupiedBothDays);
    }
}
