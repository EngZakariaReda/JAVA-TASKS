public class AddingBits {
    public long num1;
    public long num2;

    AddingBits(long a , long b){
        num1 = a ;
        num2 = b ;
    }

    public long bitwiseXOR(){
        long result = num1 ^ num2 ;
        return result ;
    }
}
