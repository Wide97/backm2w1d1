package marcowidesott.backm2w1d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Menu {
    private int calories;
    private double price;
}
