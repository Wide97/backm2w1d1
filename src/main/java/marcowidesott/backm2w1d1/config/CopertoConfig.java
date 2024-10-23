package marcowidesott.backm2w1d1.config;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
public class CopertoConfig {

    @Value("${coperto.costo}")
    private double costoCoperto;

    public double getCostoCoperto() {
        return costoCoperto;
    }
}
