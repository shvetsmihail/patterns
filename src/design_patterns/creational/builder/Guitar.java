package design_patterns.creational.builder;

public class Guitar {
    private Type type;
    private int price;

    public void setType(Type type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
