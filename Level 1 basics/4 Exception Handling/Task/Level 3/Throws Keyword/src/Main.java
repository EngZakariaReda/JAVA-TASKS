import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File could not be read");
        }
    }

    public static void readFile() throws IOException {

        FileReader file = new FileReader("C:\\Users\\DELL\\Downloads\\javatest.txt");
        System.out.println("File opened successfully.");
        file.close();
    }
}