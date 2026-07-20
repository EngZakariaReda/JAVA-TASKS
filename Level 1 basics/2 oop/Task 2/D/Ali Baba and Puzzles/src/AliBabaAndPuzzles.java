public class AliBabaAndPuzzles {
    public int num1;
    public int num2;
    public int num3;
    public int num4;

    AliBabaAndPuzzles(int num1 ,int num2 ,int num3 ,int num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public void solvePuzzle (){

        if ((num4 == num1 * num2 + num3) || (num4 == num1 * num2 - num3)) {
            System.out.println("YES");
        }
        else if ((num4 == num1 + num2 * num3) || (num4 == num1 + num2 - num3)) {
            System.out.println("YES");
        }
        else if ((num4 == num1 - num2 * num3) || (num4 == num1 - num2 + num3)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
