package br.com.rodosafra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class LocaleDistanceServiceFApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocaleDistanceServiceFApplication.class, args);
	}

}
