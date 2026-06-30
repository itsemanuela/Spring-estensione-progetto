package runners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class OrdineRunner implements CommandLineRunner {

    //leggo il prezzo dalla properties
    @Value("${coperto.price}")
        private double costoCopertoLetto;
    @Override
    public void run(String... args) throws Exception {

    }
}
