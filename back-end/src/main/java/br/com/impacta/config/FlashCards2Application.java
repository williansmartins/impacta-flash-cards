package br.com.impacta.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.impacta.controller"})
@EntityScan("br.com.impacta.model")
@EnableJpaRepositories("br.com.impacta.repository")
public class FlashCards2Application {

	public static void main(String[] args) {
		SpringApplication.run(FlashCards2Application.class, args);
	}
}
