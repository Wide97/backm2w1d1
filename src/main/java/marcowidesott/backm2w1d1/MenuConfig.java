package marcowidesott.backm2w1d1;

import marcowidesott.backm2w1d1.entities.Bibite;
import marcowidesott.backm2w1d1.entities.Pizza;
import marcowidesott.backm2w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {
    @Bean
    public Pizza getPizza() {
        return new Pizza(200, 18.99, "Salamino");
    }

    @Bean
    public Bibite getBibita() {
        return new Bibite(50, 5.99, "Coca Cola");
    }

    @Bean
    public Topping getTopping() {
        return new Topping(100, 1.99, "Prosciutto");
    }

}
