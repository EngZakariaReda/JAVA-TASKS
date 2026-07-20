public class Katryoshka {
    public long eyes;
    public long mouths ;
    public long bodies;
    public long min;
    public long maxNumber = 0 ;

    public void getLargestKatryoshka (){

       if (eyes == 0 || bodies == 0){
           System.out.println(maxNumber);
           return;
       }
       min = Math.min(eyes , Math.min(mouths , bodies));
       maxNumber += min ;
       eyes -= min;
       bodies -= min;

       long remainValues = Math.min(eyes /2 , bodies);
       maxNumber += remainValues;
       System.out.println(maxNumber);
    }
}
