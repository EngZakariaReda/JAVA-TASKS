import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "null";

        try {
            String result = name.toUpperCase();
            System.out.println(result);

            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
        } catch (NullPointerException exception){
            System.out.println("String is null!");
        }
    }
}