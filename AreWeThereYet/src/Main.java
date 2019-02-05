import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputDistances =  input.nextLine();
        ArrayList nums = new ArrayList();
        String x ="";
        String output = "0";
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

        //PRINTING STUFF BELOW

        output = output + " " + nums.get(0).toString();
        y = Integer.parseInt(nums.get(1).toString()) + Integer.parseInt(nums.get(0).toString());
        output = output + " " + y;
        y = y + Integer.parseInt(nums.get(2).toString());
        output = output + " " + y;
        y = y + Integer.parseInt(nums.get(3).toString());
        output = output + " " + y;
        System.out.println(output); //output 1

        output = nums.get(0).toString() + " " + "0 " + nums.get(1).toString();
        y = Integer.parseInt(nums.get(1).toString()) + Integer.parseInt(nums.get(2).toString());
        output = output + " " + y;
        y = y + Integer.parseInt(nums.get(3).toString());
        output = output + " " + y;
        System.out.println(output); //output 2

        y = Integer.parseInt(nums.get(0).toString()) + Integer.parseInt(nums.get(1).toString());
        output = "" + y + " " + nums.get(1).toString() + " 0 " + nums.get(2).toString();
        y = Integer.parseInt(nums.get(2).toString()) + Integer.parseInt(nums.get(3).toString());
        output = output + " " + y;
        System.out.println(output); //output 3

        y = Integer.parseInt(nums.get(0).toString()) + Integer.parseInt(nums.get(1).toString())  + Integer.parseInt(nums.get(2).toString());
        output = "" + y;
        y = y - Integer.parseInt(nums.get(0).toString());
        output = output + " " + y + " " + nums.get(2).toString() + " 0 " + nums.get(3).toString();
        System.out.println(output); //output 4

        y = Integer.parseInt(nums.get(0).toString()) + Integer.parseInt(nums.get(1).toString())  + Integer.parseInt(nums.get(2).toString()) + Integer.parseInt(nums.get(3).toString());
        output = "" + y;
        y = y - Integer.parseInt(nums.get(0).toString());
        output = output + " " + y;
        y = y - Integer.parseInt(nums.get(1).toString());
        output = output + " " + y + " " + nums.get(3).toString() + " 0";
        System.out.println(output);
    }
}
