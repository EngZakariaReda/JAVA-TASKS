import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        AliBabaAndPuzzles checkpuzzle = new AliBabaAndPuzzles(inputScan.nextInt(),inputScan.nextInt(),inputScan.nextInt(),inputScan.nextInt());

        System.out.println("Output");
        checkpuzzle.solvePuzzle();
    }
}
