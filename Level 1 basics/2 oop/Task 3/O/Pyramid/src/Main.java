import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");

        Scanner inputScan = new Scanner(System.in);
        Pyramid pyramid = new Pyramid(inputScan.nextInt());

        System.out.println("Output");
        pyramid.printPyramid();
    }
}
