import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        MaxAndMin minMAX = new MaxAndMin();

        Scanner inputScan = new Scanner(System.in);
        minMAX.num1 = inputScan.nextInt();
        minMAX.num2 = inputScan.nextInt();
        minMAX.num3 = inputScan.nextInt();

        System.out.println("Output");
        minMAX.getMaxAndMin();
    }
}
