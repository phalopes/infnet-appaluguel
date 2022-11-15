package br.edu.infnet.applocacaoimovel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppLocacaoImovelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppLocacaoImovelApplication.class, args);
	}

}
