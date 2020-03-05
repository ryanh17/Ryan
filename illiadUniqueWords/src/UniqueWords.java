public class UniqueWords {
    private String word;

    UniqueWords(String word){
        this.word = word.toLowerCase();
        if (this.word.contains(",")){
            this.word = word.replace(",", "");
        }
    }

    public String getWord() {
        return word;
    }
}
