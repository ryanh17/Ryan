import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList sentences = new ArrayList();
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while((line = br.readLine()) != null){
            sentences.add(line);
        }

        search("them");
    }

    static void search(String word){
        for(int i = 0; i<sentences.size(); i++){
            String temp = sentences.get(i).toString();
            if (temp.contains(word)){
                System.out.println("Index Position: " + i + " Index Pos in Sentence: " + temp.indexOf(word));
            }
        }
    }
}
