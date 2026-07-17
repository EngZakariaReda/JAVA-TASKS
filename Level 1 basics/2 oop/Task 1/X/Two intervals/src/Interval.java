public class Interval {
    public int L1 ;
    public int R1 ;
    public int L2 ;
    public int R2 ;

    public void getInterval(){
        if(L2 == L1 && R2 == R1){
            System.out.println(L1 + " " + R1);
        }else if(L2 > R1 || L1 > R2){
            System.out.println(-1);
        }else if (R2 > R1){
            if(L1 > L2){
                System.out.println(L1 + " " + R1);
            }else{
                System.out.println(L2 + " " + R1);
            }
        }else{
            if(L1 > L2){
                System.out.println(L1 + " " + R2);
            }else{
                System.out.println(L2 + " " + R2);
            }
        }
    }
}