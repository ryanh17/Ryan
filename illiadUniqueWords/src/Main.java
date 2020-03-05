import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("illiad.txt"));
        HashSet<UniqueWords> set = new HashSet<>();

        UniqueWords uniqueWords = new UniqueWords("Bi,sh");
        System.out.println(uniqueWords.getWord());

        /*while(fileScanner.hasNext()){
            set.add(new UniqueWords(fileScanner.next()));
        }*/
    }
}
