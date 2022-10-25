package padroes.projeto.padroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Este projeto foi gerado através do https://start.spring.io/
 * com os seguintes modulos:
 * - Sprng JPA
 * - Spring Web
 * - H2Database
 * - OpenFeign
 *
 * @author leandrogerolim
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
