package emanuela_carrubba.estensione_esercizio;

import entities.PubMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EstensioneEsercizioApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(EstensioneEsercizioApplication.class, args);

		PubMenu pubMenu = context.getBean(PubMenu.class);

		pubMenu.stampaMenu();
	}
}