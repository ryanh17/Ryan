import java.util.Random;

public class Main {
    static void printArray(int[] array){
        for (int n : array){
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(100);
        }
        for (int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(100);
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortDesc(array1);
        bubbleSort.sortDesc(array2);
        System.out.println("PRINTING SORTED ARRAY 1");
        printArray(array1);
        System.out.println("PRINTING SORTED ARRAY 2");
        printArray(array2);

        System.out.println("PRINTING MERGED");
        printArray(bubbleSort.merge(array1, array2));
    }
}
