import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        HardCompare compare = new HardCompare();

        Scanner inputScan = new Scanner(System.in);
        compare.num1 = inputScan.nextDouble();
        compare.pow1 = inputScan.nextDouble();
        compare.num2 = inputScan.nextDouble();
        compare.pow2 = inputScan.nextDouble();

        System.out.println("Output");
        System.out.println(compare.getPower());;
    }
}
