package marcowidesott.backm2w1d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Menu {
    private String name;

    public Pizza(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
