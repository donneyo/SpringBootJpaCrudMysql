package com.neyo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootJpaCrudMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaCrudMysqlApplication.class, args);
	}

}
