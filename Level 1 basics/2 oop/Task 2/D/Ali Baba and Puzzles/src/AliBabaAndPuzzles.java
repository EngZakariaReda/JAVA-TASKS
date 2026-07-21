public class AliBabaAndPuzzles {
    public long num1;
    public long num2;
    public long num3;
    public long num4;

    AliBabaAndPuzzles(long num1 ,long num2 ,long num3 ,long num4){
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
