package com.smart_invoice.smart_invoice_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmartInvoiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartInvoiceEurekaServerApplication.class, args);
	}

}
