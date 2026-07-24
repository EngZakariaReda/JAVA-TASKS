public class Pum {
    public int number ;

    Pum(int number){
        this.number = number ;
    }

    public void printPum (){
        int pumLength = 3 ;
        int count = 1 ;
        for (int i = 1 ; i <= number ; i++){
            for (int j = 1 ; j <= pumLength ; j++){
                System.out.print(count + " ");
                ++count ;
                if (j == 3){
                    System.out.print("PUM");
                    ++count ;
                }
            }
            System.out.println();
        }
    }
}