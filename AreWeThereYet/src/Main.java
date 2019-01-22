import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputDistances =  "3 10 12 5"; //input.nextLine();
        ArrayList nums = new ArrayList();
        String x ="";
        String outputOne = "0";
        int y;

        for(int i = 0; i < inputDistances.length(); i++){
            if (inputDistances.charAt(i) != ' '){
                x = x + inputDistances.charAt(i);
            }else{
                //System.out.println(x);
                nums.add(x);
                x ="";
            }
        }
        nums.add(x);
        System.out.println(nums);

        outputOne = outputOne + " " + nums.get(0).toString();
        y = Integer.parseInt(nums.get(1).toString()) + Integer.parseInt(nums.get(0).toString());
        outputOne = outputOne + " " + y;
        y = y + Integer.parseInt(nums.get(2).toString());
        outputOne = outputOne + " " + y;
        y = y + Integer.parseInt(nums.get(3).toString());
        outputOne = outputOne + " " + y;


        System.out.println(outputOne);
    }
}
