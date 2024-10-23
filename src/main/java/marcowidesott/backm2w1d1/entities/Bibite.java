package marcowidesott.backm2w1d1.entities;

public class Bibite implements MenuItem {
    private double calories;
    private double price;
    private String name;

    public Bibite(double calories, double price, String name) {
        this.calories = calories;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
