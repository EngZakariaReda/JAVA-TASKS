import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        Scanner inputScan = new Scanner(System.in);

        DataTypeGuessing checkType = new DataTypeGuessing();
        checkType.n = inputScan.nextLong();
        checkType.k = inputScan.nextLong();
        checkType.a = inputScan.nextLong();

        System.out.println("Output");
        System.out.println(checkType.getDataType());
    }
}
