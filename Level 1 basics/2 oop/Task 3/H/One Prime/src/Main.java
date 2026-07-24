import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        OnePrime PrimeNumber = new OnePrime(inputScan.nextInt());

        System.out.println("Output");
        PrimeNumber.checkPrimeNumber();
    }
}
