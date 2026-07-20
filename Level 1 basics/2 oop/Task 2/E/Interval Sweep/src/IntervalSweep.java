public class IntervalSweep {
    public int oddNums ;
    public int evenNums ;

    IntervalSweep(int a , int b){
        oddNums = a ;
        evenNums = b ;
    }

    public void checkInterval (){

        if (oddNums < 0 || evenNums > 100 || oddNums > 100 || evenNums < 0){
            System.out.println("please a , b should be >= 0 & <= 100");
            return;
        }

        if ((oddNums == 0 && evenNums == 0) ||oddNums - evenNums >= 2 || evenNums - oddNums >= 2 ){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
}
