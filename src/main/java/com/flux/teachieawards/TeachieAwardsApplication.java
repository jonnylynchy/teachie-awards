package com.flux.teachieawards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		TeachieAwardsApplication.class,
		Jsr310JpaConverters.class
})
public class TeachieAwardsApplication {
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		System.out.println("DATA SOURCE URL:" + System.getenv("TEACHIES_DATASOURCE_URL_PROD"));
		SpringApplication.run(TeachieAwardsApplication.class, args);
	}
}

