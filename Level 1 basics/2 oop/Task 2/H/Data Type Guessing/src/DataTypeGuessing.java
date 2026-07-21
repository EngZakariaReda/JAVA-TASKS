public class DataTypeGuessing {
    public long n ;
    public long k ;
    public long a ;

    public String getDataType(){
      if ((n * k) % a == 0 ) {
          if ((n * k) / a >= -Math.pow(2 , 31) && (n * k) / a <= (Math.pow(2 , 31) - 1) ){
            return "int";
          }
          return "long long";
      }
      return "double";
    }
}
