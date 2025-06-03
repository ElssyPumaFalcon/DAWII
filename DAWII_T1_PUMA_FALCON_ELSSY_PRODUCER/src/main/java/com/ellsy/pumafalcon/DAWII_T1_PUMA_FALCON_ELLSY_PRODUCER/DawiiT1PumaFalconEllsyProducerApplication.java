package com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DawiiT1PumaFalconEllsyProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DawiiT1PumaFalconEllsyProducerApplication.class, args);
	}
}