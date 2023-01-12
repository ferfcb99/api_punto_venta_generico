package punto_de_venta.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@SpringBootApplication
public class PuntoDeVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntoDeVentaApplication.class, args);
	}
	
}
