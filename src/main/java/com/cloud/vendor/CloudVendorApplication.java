package com.cloud.vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudVendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudVendorApplication.class, args);
		System.out.println("Hello Julie");
	}

}
