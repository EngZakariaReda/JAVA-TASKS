public class Pyramid {
    public int number ;

    Pyramid(int number){
        this.number = number ;
    }

    public void printPyramid (){
        for (int i = 1 ; i <= number ; i++){
            for (int j = 1 ; i >= j ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
