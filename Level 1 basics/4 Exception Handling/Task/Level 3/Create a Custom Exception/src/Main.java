import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("enter your age");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age) throws CheckAgeException{
        if (age < 18){
            throw new CheckAgeException("Age must be more than 18");
        }
        System.out.println("allowed age");
    }
}