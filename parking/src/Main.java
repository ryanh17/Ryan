
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int parkingSpaces = Integer.parseInt((input.nextLine()));
        String yesterdayParking = input.nextLine();
        String todayParking = input.nextLine();
        ArrayList yesterday = new ArrayList();
        ArrayList today = new ArrayList();
        int occupiedBothDays = 0;
        int i = 0;
        int n = 0;

        while (i < parkingSpaces){
            char y = yesterdayParking.charAt(i);
            char t = todayParking.charAt(i);
            yesterday.add(y);
            today.add(t);
            if(yesterday.get(i).equals("C") && today.get(i).equals("C")){
                occupiedBothDays++;
            }
            i++;
        }
        yesterday.toString();
        today.toString();
        System.out.println(yesterday);
        if(yesterday.get(n).equals("C") && today.get(n).equals("C")){
            occupiedBothDays++;
            n++;
        }
        System.out.println(occupiedBothDays);
    }
}
