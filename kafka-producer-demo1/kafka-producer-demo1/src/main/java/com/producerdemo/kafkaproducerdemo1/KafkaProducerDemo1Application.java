package com.producerdemo.kafkaproducerdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.producer.controller")
public class KafkaProducerDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerDemo1Application.class, args);
	}

}
