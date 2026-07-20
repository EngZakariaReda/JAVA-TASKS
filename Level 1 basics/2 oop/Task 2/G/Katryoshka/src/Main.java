import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        Scanner inputScan = new Scanner(System.in);

        Katryoshka katryoshka = new Katryoshka();
        katryoshka.eyes = inputScan.nextLong();
        katryoshka.mouths = inputScan.nextLong();
        katryoshka.bodies = inputScan.nextLong();

        System.out.println("Output");
        katryoshka.getLargestKatryoshka();
    }
}
