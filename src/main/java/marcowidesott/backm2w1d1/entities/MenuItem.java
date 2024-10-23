package marcowidesott.backm2w1d1.entities;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


public abstract class MenuItem {
    private int calories;
    private double price;

    public MenuItem(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "calories=" + calories +
                ", price=" + price +
                '}';
    }
}
