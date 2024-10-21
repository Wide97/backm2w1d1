package marcowidesott.backm2w1d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends Menu {
    private String topping;

    public Topping(int calories, double price, String topping) {
        super(calories, price);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "topping='" + topping + '\'' +
                '}';
    }
}
