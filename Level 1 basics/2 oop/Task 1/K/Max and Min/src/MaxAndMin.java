public class MaxAndMin {
    public int num1 ;
    public int num2 ;
    public int num3 ;
    public int max ;
    public int min ;

    public void getMaxAndMin(){
        if(num1 > num2){
            if(num2 > num3){
                max = num1;
                min = num3;
            }else if (num1 > num3){
                max = num1;
                min = num2;
            }else{
                max = num3;
                min = num2;
            }
        }else{
            if(num2 > num3){
                if (num3 > num1){
                    max = num2;
                    min = num1;
                }else{
                    max = num2;
                    min = num3;
                }
            }else{
                max = num3;
                min = num1;
            }
        }
        System.out.println(min + " " + max);
    }
}
