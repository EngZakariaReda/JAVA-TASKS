import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Interval intervalNumbers = new Interval();

        Scanner inputScan = new Scanner(System.in);
        intervalNumbers.L1 = inputScan.nextInt();
        intervalNumbers.R1 = inputScan.nextInt();
        intervalNumbers.L2 = inputScan.nextInt();
        intervalNumbers.R2 = inputScan.nextInt();

        System.out.println("Output");
        intervalNumbers.getInterval();
    }
}