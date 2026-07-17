import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        Scanner inputScan = new Scanner(System.in);

        Calulator calcEquation = new Calulator();
        calcEquation.equation =inputScan.nextLine();

        System.out.println("Output");
        System.out.println(calcEquation.getValue());
    }
}
