import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("illiad.txt"));
        HashSet<UniqueWords> set = new HashSet<>();


        while(fileScanner.hasNext()){
            set.add(new UniqueWords(fileScanner.next()));
        }


        Iterator<UniqueWords> wordsIterator = set.iterator();

        while(wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }
        System.out.println("---------------------------------------");
        System.out.println("Number of unique words: " + set.size());
    }
}
