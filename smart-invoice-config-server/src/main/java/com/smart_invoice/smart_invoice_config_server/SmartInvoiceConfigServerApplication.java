package com.smart_invoice.smart_invoice_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SmartInvoiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartInvoiceConfigServerApplication.class, args);
	}

}
