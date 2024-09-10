package es.neesis.facturaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FacturaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaServiceApplication.class, args);
	}

}
