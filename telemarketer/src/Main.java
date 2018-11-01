import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println("Type Telephone Number:");
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());


        if ((list.get(0).equals(8) || list.get(0).equals(9)) && list.get(1).equals(list.get(2)) && (list.get(3).equals(8) || list.get(3).equals(9))) {
            System.out.println("ignore");
        }else{
            System.out.println("answer");
        }
    }
}
