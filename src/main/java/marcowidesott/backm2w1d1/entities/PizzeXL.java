package marcowidesott.backm2w1d1.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PizzeXL extends Menu {
    private String name;

    public PizzeXL(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "PizzeXL{" +
                "name='" + name + '\'' +
                '}';
    }
}
