package marcowidesott.backm2w1d1.runners;

import marcowidesott.backm2w1d1.config.CopertoConfig;
import marcowidesott.backm2w1d1.config.MenuConfig;
import marcowidesott.backm2w1d1.models.Ordine;
import marcowidesott.backm2w1d1.models.Tavolo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MenuRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MenuRunner.class);
    @Autowired
    private MenuConfig menuConfig;
    @Autowired
    private CopertoConfig copertoConfig;

    @Override
    public void run(String... args) throws Exception {
        Tavolo tavolo = new Tavolo(1, 4, "occupato");
        Ordine ordine = new Ordine(1, tavolo, Arrays.asList(menuConfig.Salamino(), menuConfig.CocaCola()), "in corso", 3, copertoConfig.getCostoCoperto());

        logger.info("Ordine creato: " + ordine);
        logger.info("Totale ordine: " + ordine.calcolaTotale() + " Euro");
    }
}
