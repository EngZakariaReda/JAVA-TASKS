import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        MemoAndMomo winner = new MemoAndMomo(inputScan.nextLong() , inputScan.nextLong(), inputScan.nextLong());

        System.out.println("Output");
        System.out.println(winner.getWinner());
    }
}
