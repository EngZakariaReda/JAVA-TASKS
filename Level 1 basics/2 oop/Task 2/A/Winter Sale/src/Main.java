//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        WinterSale sale = new WinterSale();

        Scanner inputScan = new Scanner(System.in);
        sale.discount = inputScan.nextDouble();
        sale.finalPrice = inputScan.nextDouble();

        System.out.println("Output");
        System.out.println(sale.getBaseResult());
    }
}
