import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        NextAlphabet nextCharacter = new NextAlphabet(inputScan.next().charAt(0));

        System.out.println("Output");
        nextCharacter.getNextChar();
    }
}

