import java.util.LinkedHashMap;

public class CaesarCipher {
    private int numberShifts;
    private String message;
    private String encryptedMessage ="";
    private String decryptedMessage ="";

    private LinkedHashMap<Character, Integer> encryptionKey = new LinkedHashMap<>();
    private LinkedHashMap<Integer, Character> decryptionKey = new LinkedHashMap<>();
    private Character[] alphabet = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    CaesarCipher(String message, int numberShifts){
        this.message = message;
        this.numberShifts = (numberShifts%26);

        for(int i = 1; i<27;i++){
            encryptionKey.put(alphabet[i-1], i);
            decryptionKey.put(i, alphabet[i-1]);
        }
    }

    public String encrypt(){
        for (int i = 0; i < message.length(); i++){
            encryptedMessage += decryptionKey.get(((encryptionKey.get(message.charAt(i)) + numberShifts)%26));
        }
        return encryptedMessage;
    }

    public String decrypt(){
        for (int i = 0; i < message.length(); i++){
            if(((encryptionKey.get(message.charAt(i)) - numberShifts)%26) <= 0){
                decryptedMessage += decryptionKey.get(((encryptionKey.get(message.charAt(i)) - numberShifts)%26)+26);
            }else{
                decryptedMessage += decryptionKey.get(((encryptionKey.get(message.charAt(i)) - numberShifts)%26));
            }
        }
        return decryptedMessage;
    }
}
