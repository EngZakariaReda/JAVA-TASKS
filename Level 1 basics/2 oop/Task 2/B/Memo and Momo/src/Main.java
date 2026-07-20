import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        MemoAndMomo winner = new MemoAndMomo(inputScan.nextDouble() , inputScan.nextDouble(), inputScan.nextDouble());

        System.out.println("Output");
        System.out.println(winner.getWinner());
    }
}
