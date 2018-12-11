import java.util.ArrayList;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0; //stores # of vowels
        ArrayList characters = new ArrayList();
        for (int i = 0; i<s.length();){ //for loop for convert string s into ArrayList
            char x = s.charAt(i); //gets char from string s
            characters.add(x);
            if(characters.get(i).equals('a') || characters.get(i).equals('e') || characters.get(i).equals('i') || characters.get(i).equals('o') || characters.get(i).equals('u')) {
                answer++; //check if there are any vowels and if true to any then add one to answer
            }
            i++; //advances for loop
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0; //# of times bob occurs
        ArrayList characters = new ArrayList();
        for (int i = 0; i<s.length();){ //for loop converts string s into ArrayList
            char x = s.charAt(i);
            characters.add(x);
            i++;
        }
        for (int i = 0; i<= (s.length() - 2);){ //for loop for checking for 'b' 'o' 'b' in ArrayList
            if((characters.get(i).equals('b')) && (characters.get(i + 1).equals('o')) && (characters.get(i + 2).equals('b'))){
                answer++; //checks if first char is 'b' then checks if next is 'o' and then checks if next one is 'b'. If all true than add one to answer
            }
            i++;
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String answer = "";
        ArrayList preAnswer = new ArrayList(); //adds breaks into characters ArrayList
        ArrayList characters = new ArrayList(); //ArrayList for the original string s
        ArrayList tempArray = new ArrayList(); //temporary array used to compare for longest substring
        ArrayList longestArray = new ArrayList(); //ArrayList answer
        int n = 0; //used to convert char into int
        for (int i = 0; i<s.length();){ //for loop that takes original string s and turns into ArrayList
            char y = s.charAt(i);
            n = y;
            characters.add(n);
            i++;
        }
        for(int i = 0; i < characters.size()-1;){ //for loop that takes the character ArrayList above and adds breaks
            if ((int)characters.get(i) <= (int)characters.get(i + 1)){ //adds breaks by comparing if next char is greater
                preAnswer.add(characters.get(i)); //if char is less than or equal to the next char then add it to ArrayList preAnswer
            }else { //if char is greater than next char then still add the char but also add a period(46) into preAnswer
                preAnswer.add(characters.get(i));
                preAnswer.add(46);
            }
            i++;
        }
        preAnswer.add(characters.get(characters.size() -1)); //this adds the last char from original string/ArrayList because for loop above doesn't work on last char
        for (int i = 0; i < preAnswer.size();){ //for loop that compares each section of preAnswer
            if((int)preAnswer.get(i) != 46){ //first adds characters up to the next period(46) to tempArray
                tempArray.add(preAnswer.get(i));
            }else{ //when hitting a period(46) then....
                if(tempArray.size() > longestArray.size()){ //check if tempArray is greater than the longestArray
                    longestArray.clear(); //if yes then clear the longest Array and...
                    for(int q = 0; q <tempArray.size();){ //make longestArray the same as tempArray by looping through characters
                        longestArray.add(tempArray.get(q));
                        q++;
                    }
                }
                tempArray.clear(); //clears tempArray for next round
            }
            i++; //advances master for loop
        }
        for(int i = 0; i < longestArray.size();){ //for loop for converting the longestArray into a string called answer
            answer = answer + (Character.toString((char)(int)longestArray.get(i)));//adds char to answer
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
        System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));
    }
}
