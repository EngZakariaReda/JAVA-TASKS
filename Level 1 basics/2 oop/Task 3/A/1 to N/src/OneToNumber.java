public class OneToNumber {
    public int number ;

    OneToNumber(int number){
        this.number = number ;
    }

    public void printToNumber (){
        for (int i = 1 ; i <= number ; i++){
            System.out.println(i);
        }
    }
}
