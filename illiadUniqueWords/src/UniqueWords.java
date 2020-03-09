import java.util.Objects;

public class UniqueWords {
    private String word;

    UniqueWords(String word){
        this.word = word.replaceAll("[\"-;.,?:'()!]", "").toLowerCase();
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof UniqueWords){
            UniqueWords other = (UniqueWords)o;
            if (other.getWord().equals(word)) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return word;
    }
}
