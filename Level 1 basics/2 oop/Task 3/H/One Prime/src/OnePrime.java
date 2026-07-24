public class OnePrime {
    public int number ;

    OnePrime(int number){
        this.number = number ;
    }

    public void checkPrimeNumber (){
        if (number <= 1) {
            System.out.println("NO");
            return;
        }

        if (number <= 3) {
            System.out.println("YES");
            return;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("NO");
            return;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}
