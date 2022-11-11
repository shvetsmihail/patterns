package design_patterns.creational.prototype;

public class Cookie implements Prototype {

    private int price;

    public Cookie(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Cookie{" +
                "price=" + price +
                '}';
    }

    @Override
    public Cookie copy() {
        return new Cookie(price + 1);
    }
}
