package marcowidesott.backm2w1d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Pizza extends Menu {
    private String pizza;

    public Pizza(int calories, double price) {
        super(calories, price);
    }
}
