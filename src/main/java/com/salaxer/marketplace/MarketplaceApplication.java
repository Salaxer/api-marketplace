package com.salaxer.marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(scanBasePackages={"com.platzimarket.persistence.mapper.ProductMapper"})
@SpringBootApplication
public class MarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceApplication.class, args);
	}

}
