import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String text = input.nextLine();

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number = " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        } finally {
            System.out.println("the transformation ended");
        }
    }
}