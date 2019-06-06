import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList sentences = new ArrayList();
    static String blah = "";
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;


        while((line = br.readLine()) != null){
            blah += line;
        }

        String temp = "";
        for (int i = 0; i < blah.length(); i++){
            if (blah.charAt(i) != '.'){
                temp += blah.charAt(i);
            }else{
                if (blah.charAt(i + 1) == '['){
                    temp += ".";
                    temp += blah.charAt(i+1);
                    temp += blah.charAt(i+2);
                    temp += blah.charAt(i+3);
                    sentences.add(temp);
                    temp = "";
                    i = i +3;
                }else{
                    sentences.add((temp + "."));
                    temp = "";
                }
            }
        }
        search("punch");
        System.out.println(sentences.get(2));
    }

    static void search(String word){
        for(int i = 0; i<sentences.size(); i++){
            String temp = sentences.get(i).toString();
            if (temp.contains(word)){
                String temp2;
                System.out.println("Index Position: " + i);
            }
        }
    }

    static void whereInSentence(String sentence){
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) != ' ' || sentence.charAt(i) != '.'){

            }
        }
    }
}
