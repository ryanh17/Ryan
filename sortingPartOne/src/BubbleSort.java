import java.lang.reflect.Array;

public class BubbleSort {
    public int[] sortDesc (int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++){
                if (array[j-1] < array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int[] merge (int[] arrayOne, int[] arrayTwo){
        int[] merged = new int[arrayOne.length + arrayTwo.length];

        int arrayOneIndex = 0;
        int arrayTwoIndex = 0;

        for (int n = 0; n < merged.length; n++){
            if ((arrayOneIndex < arrayOne.length) && (arrayTwoIndex < arrayTwo.length)){
                if (arrayOne[arrayOneIndex] > arrayTwo[arrayTwoIndex]){
                    merged[n] = arrayOne[arrayOneIndex];
                    arrayOneIndex++;
                }else{
                    merged[n] = arrayTwo[arrayTwoIndex];
                    arrayTwoIndex++;
                }
            } else if (arrayOneIndex >= arrayOne.length){
                merged[n] = arrayTwo[arrayTwoIndex];
                arrayTwoIndex++;
            } else if (arrayTwoIndex >= arrayTwo.length){
                merged[n] = arrayOne[arrayOneIndex];
                arrayOneIndex++;
            }
        }
        return merged;
    }
}
