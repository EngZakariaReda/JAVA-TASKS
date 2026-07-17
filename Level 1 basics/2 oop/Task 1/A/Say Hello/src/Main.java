import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);

        InputReader reader = new InputReader();
        reader.message = inputScan.nextLine();

        System.out.println("Output");
        reader.printMessage();
    }
}