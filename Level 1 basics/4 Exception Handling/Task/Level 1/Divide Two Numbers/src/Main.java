import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number and second number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}