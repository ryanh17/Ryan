import java.util.Arrays;
import java.util.Scanner;

public class Second {
    static int[] nums = new int[4];
    static int[] addedValues = new int[5];

    public static void addValue(int value){
        for (int i = 0; i < nums.length;){
            addedValues[i] = nums[i];
            i++;
        }
        addedValues[4] = value;
        System.out.println(Arrays.toString(addedValues));
    }

    public static void deleteValue(){
        int[] deletedValue = new int[3];
        int poppedValue = nums[3];
        for (int i = 0; i < deletedValue.length;){
            deletedValue[i] = nums[i];
            i++;
        }
        System.out.println(Arrays.toString(deletedValue));
        System.out.println("Popped Value: "+ poppedValue);
    }

    public static void insertValue(int pos, int value){
        int[] insertedValue = new int[5];
        for(int i = 0; i < insertedValue.length;){
            insertedValue[i] = nums[i];
            if(i == pos){
                insertedValue[i] = value;
            }
            if(i == pos){
                i++;
                insertedValue[i] = nums[i -1];
            }
            i++;
        }
        System.out.println(Arrays.toString(insertedValue));
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nums.length;){
            nums[i] = input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(nums));
        //addValue(3);
        //deleteValue();
        insertValue(2,9);

    }
}
