package com.nivell2.springBootNivell2Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootNivell2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNivell2DemoApplication.class, args);
	}

}
