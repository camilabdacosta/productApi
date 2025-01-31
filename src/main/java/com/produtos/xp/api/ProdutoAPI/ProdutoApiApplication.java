package com.produtos.xp.api.ProdutoAPI;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoApiApplication {
	public static void main(String[] args) {
			Dotenv dotenv = Dotenv.configure()
					.directory("./")
					.ignoreIfMissing()
					.load();

			dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

			SpringApplication.run(ProdutoApiApplication.class, args);
		}
	}
