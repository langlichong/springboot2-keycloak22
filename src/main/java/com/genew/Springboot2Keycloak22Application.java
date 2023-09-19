package com.genew;

import com.genew.util.SSLTool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot2Keycloak22Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2Keycloak22Application.class, args);
		SSLTool.disableCertificateValidation();
	}

}
