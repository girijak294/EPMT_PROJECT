
class PizzaBase {
    private String name;
    private double price;

    public PizzaBase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}