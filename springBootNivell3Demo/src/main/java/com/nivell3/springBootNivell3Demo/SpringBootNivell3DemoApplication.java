package com.nivell3.springBootNivell3Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootNivell3DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNivell3DemoApplication.class, args);
	}

}
