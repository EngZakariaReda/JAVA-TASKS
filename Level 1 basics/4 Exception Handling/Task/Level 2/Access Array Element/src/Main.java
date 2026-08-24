import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value = " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } finally {
            System.out.println("index must be between 0 and lengthOfArray - 1");
        }
    }
}