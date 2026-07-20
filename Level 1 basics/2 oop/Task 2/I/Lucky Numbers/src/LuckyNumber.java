public class LuckyNumber {
    public int number ;

    public void printLucky(){

        if (number < 10 || number > 99) {
            System.out.println("please enter number between 10 and 100");
            return;
        }

        String numberString = String.valueOf(number);
        int num1 = Integer.parseInt(String.valueOf(numberString.charAt(0)));
        int num2 = Integer.parseInt(String.valueOf(numberString.charAt(1)));

        System.out.println("Output");

        if ( num2 == 0 || num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
