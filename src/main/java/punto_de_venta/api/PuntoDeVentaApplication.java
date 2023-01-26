package punto_de_venta.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@SpringBootApplication
public class PuntoDeVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntoDeVentaApplication.class, args);
		Logger logger = LogManager.getLogger(PuntoDeVentaApplication.class);
		
		logger.error("Error de logers");

	}
	
}
