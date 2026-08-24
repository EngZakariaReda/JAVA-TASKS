
public class Main {

    static void checkArthimetic() {
        System.out.println(20 / 0);
    }

    static void getCheck() {
        checkArthimetic();
    }

    public static void main(String[] args) {

        try {
           getCheck();
        } catch (ArithmeticException e) {
            System.out.println("can not divide / 0");
        }
    }
}