package com.septian.test_teknikal_ikonsultan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.septian.test_teknikal_ikonsultan.feignclient")
public class TestTeknikalIkonsultanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTeknikalIkonsultanApplication.class, args);
	}

}
