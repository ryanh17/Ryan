import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList nums = new ArrayList();
    static Scanner input = new Scanner(System.in);

    public static void addValues(int a){
        nums.add(a);
    }

    public static void deleteValues(ArrayList a){
        a.remove(a.size() - 1);
    }

    public static void main(String[] args) {
        nums.add(input.nextInt());
        nums.add(input.nextInt());
        nums.add(input.nextInt());
        nums.add(input.nextInt());
        addValues(2);
        deleteValues(nums);
        System.out.println(nums);
    }
}
