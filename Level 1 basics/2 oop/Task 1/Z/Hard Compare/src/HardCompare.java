public class HardCompare {
    public double num1 ;
    public double pow1 ;
    public double num2 ;
    public double pow2 ;

    public String getPower(){
        if( Math.pow(num1 , pow1) > Math.pow(num2 , pow2) ){
            return "YES" ;
        }
        return "NO";
    }
}
