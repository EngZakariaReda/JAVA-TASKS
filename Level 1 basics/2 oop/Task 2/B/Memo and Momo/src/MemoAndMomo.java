public class MemoAndMomo{
    public long a;
    public long b;
    public long k;

    MemoAndMomo(long a ,long b ,long k){
        this.a = a;
        this.b = b;
        this.k = k;
    };

    public String getWinner(){
        if (a < 0 || b < 0 || k <= 0){
            return "a , b , k must be positive numbers & k must be > 0";
        }

        if (a % k == 0 && b % k == 0){
            return "Both";
        }else if (a % k == 0) {
            return "Memo";
        }else if (b % k == 0) {
            return "Momo";
        }else{
            return "No One";
        }
    }

}
