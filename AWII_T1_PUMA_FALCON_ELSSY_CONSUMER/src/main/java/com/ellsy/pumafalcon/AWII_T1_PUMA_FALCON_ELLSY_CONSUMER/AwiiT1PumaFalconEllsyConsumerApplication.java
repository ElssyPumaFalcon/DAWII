package com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwiiT1PumaFalconEllsyConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwiiT1PumaFalconEllsyConsumerApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
