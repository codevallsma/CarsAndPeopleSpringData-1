package com.example;

import com.example.service.CarService;
import com.example.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { CarApplication.class, Jsr310JpaConverters.class }
)
@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(CarApplication.class, args);

		CarService carService=context.getBean(CarService.class);

		PersonService personaService =context.getBean(PersonService.class);

		personaService.testPeople();
		carService.testCars();


	}
}
