import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        IntervalSweep checkInterval = new IntervalSweep(inputScan.nextInt(),inputScan.nextInt());

        System.out.println("Output");
        checkInterval.checkInterval();
    }
}
