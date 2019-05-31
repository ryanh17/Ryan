import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    static void stringToFile(String filename, String input) throws IOException {
        FileOutputStream out = new FileOutputStream(filename);
        byte[] stringBytes = input.getBytes();
        out.write(stringBytes);
    }

    public static void main(String[] args) throws IOException {
        stringToFile("hello.text", "hello");
    }
}
