public class Main {
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher("yellow", 3);
        System.out.println("Encrypted Message: " + cc.encrypt());

        CaesarCipher cc2 = new CaesarCipher("bhoorz", 3);
        System.out.println("Decrypted Message: " + cc2.decrypt());
    }
}
