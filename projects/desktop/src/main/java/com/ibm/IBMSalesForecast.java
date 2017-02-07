package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan({"com.ibm.*"})
@SpringBootApplication
public class IBMSalesForecast extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IBMSalesForecast.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(IBMSalesForecast.class, args);
	}
 }
