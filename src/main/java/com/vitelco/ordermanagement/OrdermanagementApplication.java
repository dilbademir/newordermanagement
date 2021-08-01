package com.vitelco.ordermanagement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class OrdermanagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(OrdermanagementApplication.class, args);
	}

}
