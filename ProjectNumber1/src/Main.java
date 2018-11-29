import java.util.ArrayList;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        ArrayList characters = new ArrayList();
        for (int i = 0; i<s.length();){
            char x = s.charAt(i);
            characters.add(x);
            if(characters.get(i).equals('a') || characters.get(i).equals('e') || characters.get(i).equals('i') || characters.get(i).equals('o') || characters.get(i).equals('u')) {
                answer++;
            }
            i++;
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        ArrayList characters = new ArrayList();
        for (int i = 0; i<s.length();){
            char x = s.charAt(i);
            characters.add(x);
            i++;
        }
        for (int i = 0; i<= (s.length() - 2);){
            if((characters.get(i).equals('b')) && (characters.get(i + 1).equals('o')) && (characters.get(i + 2).equals('b'))){
                answer++;
            }
            i++;
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";
        ArrayList alphaList = new ArrayList();
        ArrayList characters = new ArrayList();
        int x = 0;
        int n = 0;
        for(int i = 0; i<alphabet.length();){
            char a = alphabet.charAt(i);
            x =  (int)a;
            alphaList.add(x);
            i++;
        }
        for (int i = 0; i<s.length();){
            char y = s.charAt(i);
            n++;
            characters.add(y);
            i++;
        }
        for(int i = 0; i<s.length();){
            if ((int)characters.get(i)<(int)characters.get(i +1)){
               answer = answer + characters.get(i);
            }
            i++;
        }
        return answer;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "azcbobobegghakl";
        //System.out.println("Number of vowels: " + problemOne(s));
        //System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println(problemThree(s));
    }
}
