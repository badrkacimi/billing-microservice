package org.openlab.openlabbillingservice;

import java.math.BigDecimal;

import org.openlab.dto.InvoiceRequestDTO;
import org.openlab.feign.CustomerServiceRestClient;
import org.openlab.services.InvoiceService;
import org.openlab.web.InvoiceRestAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableJpaRepositories("org.openlab.repositories")
@ComponentScan({"org.openlab.services"})
@ComponentScan({"org.openlab.mapper"})
@ComponentScan({"org.openlab.feign"})
@EntityScan("org.openlab.entities")
@ComponentScan(basePackageClasses = InvoiceRestAPI.class)
public class BillingServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	@Bean
    CommandLineRunner commandLineRunner(InvoiceService invoiceService){
        return args -> {
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(8700),"001"));
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(5400),"001"));
        };
    }
}
