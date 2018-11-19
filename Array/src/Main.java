import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void addValue(int[] array, int value){
        int[] addedValues = new int[array.length + 1];
        addedValues[addedValues.length -1] = value;
        for (int i = 0; i < array.length;){
            addedValues[i] = array[i];
            i++;
        }
        System.out.println(Arrays.toString(addedValues));
    }

    public static void deleteValue(int[] array){
        int[] deletedValue = new int[array.length - 1];
        int poppedValue = array[array.length -1];
        for (int i = 0; i < deletedValue.length;){
            deletedValue[i] = array[i];
            i++;
        }
        System.out.println(Arrays.toString(deletedValue));
        System.out.println("Popped Value: "+ poppedValue);
    }

    public static void insertValue(int[] array, int pos, int value){
        int[] insertedValue = new int[array.length + 1];
        insertedValue[pos] = value;
        for(int i = 0; i < array.length;){
            if(i >= pos){
                insertedValue[i + 1] = array[i];
            }else{
                insertedValue[i] = array[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(insertedValue));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length;){
            nums[i] = input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(nums));
        //addValue(nums, 3);
        //deleteValue(nums);
        //insertValue(nums,2,9);

    }
}