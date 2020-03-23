public class Main {
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher("abcz", 3);
        System.out.println(cc.encrypt());

        CaesarCipher cc2 = new CaesarCipher("defc", 3);
        System.out.println(cc2.decrypt());
    }
}
