package marcowidesott.backm2w1d1.entities;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Bibite extends Menu {
    private String drinks;

    public Bibite(int calories, double price, String drinks) {
        super(calories, price);
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Bibite{" +
                "drinks='" + drinks + '\'' +
                '}';
    }
}
