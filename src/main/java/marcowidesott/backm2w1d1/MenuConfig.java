package marcowidesott.backm2w1d1;

import marcowidesott.backm2w1d1.entities.Bibite;
import marcowidesott.backm2w1d1.entities.Pizza;
import marcowidesott.backm2w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {
    @Bean
    public Pizza Salamino() {
        return new Pizza(200, 18.99, "Salamino");
    }

    @Bean
    public Pizza QuattroStagioni() {
        return new Pizza(250, 19.99, "Quattro Stagioni");
    }

    @Bean
    public Bibite CocaCola() {
        return new Bibite(50, 5.99, "Coca Cola");
    }

    @Bean
    public Bibite The() {
        return new Bibite(40, 3.99, "Thè al limone");
    }

    @Bean
    public Topping Prosciutto() {
        return new Topping(100, 1.99, "Prosciutto");
    }

    @Bean
    public Topping Peperoni() {
        return new Topping(80, 1.99, "Peperoni");
    }

}
