public class AgeInDays {
    public int age ;
    public int years ;
    public int months ;
    public int days ;

    public void CalcAge(){
        years = age / 365 ;
        months = (age % 365) / 30 ;
        days = (age % 365) % 30 ;

        System.out.println(years + " " +"years");
        System.out.println(months + " " +"months");
        System.out.println(days + " " +"days");
    }
}
