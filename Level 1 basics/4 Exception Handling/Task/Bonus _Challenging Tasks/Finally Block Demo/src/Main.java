import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please enter number");
        Scanner sc = new Scanner(System.in);
        try {

            int number = sc.nextInt();
            System.out.println("your number is " + number);

            System.out.println(10 / 0);
        } catch (InputMismatchException e) {
            System.out.println("please enter number only");
        } finally {
            System.out.println("Finally block executed even if there is exception not handled");
        }
    }
}