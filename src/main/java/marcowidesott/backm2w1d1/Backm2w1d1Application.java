package marcowidesott.backm2w1d1;

import marcowidesott.backm2w1d1.entities.Bibite;
import marcowidesott.backm2w1d1.entities.Pizza;
import marcowidesott.backm2w1d1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Backm2w1d1Application {

    public static void main(String[] args) {
        SpringApplication.run(Backm2w1d1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Backm2w1d1Application.class);

        Pizza Salamino = (Pizza) context.getBean("Salamino");
        System.out.println(Salamino);

        Bibite CocaCola = (Bibite) context.getBean("CocaCola");
        System.out.println(CocaCola);

        Topping Peperoni = (Topping) context.getBean("Peperoni");
        System.out.println(Peperoni);


        context.close();
    }

}
