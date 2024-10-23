package marcowidesott.backm2w1d1.entities;

public class PizzeXL implements MenuItem {
    private double calories;
    private double price;
    private String name;

    public PizzeXL(double calories, double price, String name) {
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
