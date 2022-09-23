package Products;
import Abstract.Products;

public class Hat implements Products {

    private double price;

    @Override
    public double setPrice(double price) {
        return this.price=price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
