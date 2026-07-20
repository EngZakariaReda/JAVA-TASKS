public class WinterSale {
    public double finalPrice ;
    public double discount ;
    public double basePrice ;

    public double getBaseResult(){
        basePrice = finalPrice / (1 - (discount / 100));
        return basePrice;
    }
}
