package marcowidesott.backm2w1d1;

import marcowidesott.backm2w1d1.entities.Bibite;
import marcowidesott.backm2w1d1.entities.Pizza;
import marcowidesott.backm2w1d1.entities.PizzeXL;
import marcowidesott.backm2w1d1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Backm2w1d1Application {

    public static void main(String[] args) {
        SpringApplication.run(Backm2w1d1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Backm2w1d1Application.class);

        String[] pizzaBeans = context.getBeanNamesForType(Pizza.class);
        String[] bibiteBeans = context.getBeanNamesForType(Bibite.class);
        String[] toppingsBeans = context.getBeanNamesForType(Topping.class);
        String[] pizzexlBeans = context.getBeanNamesForType(PizzeXL.class);

        System.out.println("----------- Menu Pizze -----------");
        for (String beanName : pizzaBeans) {
            Pizza pizza = context.getBean(beanName, Pizza.class);
            System.out.println(" - " + pizza);
        }
        System.out.println("----------- Menu Bibite -----------");
        for (String beanName : bibiteBeans) {
            Bibite bibite = context.getBean(beanName, Bibite.class);
            System.out.println(" - " + bibite);
        }
        System.out.println("----------- Menu Toppings -----------");
        for (String beanName : toppingsBeans) {
            Topping topping = context.getBean(beanName, Topping.class);
            System.out.println(" - " + topping);
        }
        System.out.println("----------- Menu PizzeXL -----------");
        for (String beanName : pizzexlBeans) {
            PizzeXL pizzeXL = context.getBean(beanName, PizzeXL.class);
            System.out.println(" - " + pizzeXL);
        }


        context.close();
    }

}
