import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input");
        AgeInDays age = new AgeInDays();

        Scanner inputScan = new Scanner(System.in);
        age.age = inputScan.nextInt();

        System.out.println("Output");
        age.CalcAge();
    }
}
