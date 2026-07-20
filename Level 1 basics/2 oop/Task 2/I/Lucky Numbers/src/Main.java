import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        Scanner inputScan = new Scanner(System.in);

        LuckyNumber luckyNumber = new LuckyNumber();
        luckyNumber.number = inputScan.nextInt();

        luckyNumber.printLucky();
    }
}
