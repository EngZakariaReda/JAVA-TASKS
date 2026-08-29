public class Product {
    String code;
    double price;

    public Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Product product = (Product) obj;

        return code.equals(product.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

}
