package org.openlab.feign;

import java.util.List;

import org.openlab.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerServiceRestClient {
    @GetMapping(path="/api/customers/{id}")
    Customer customerById(@PathVariable String id);

    @GetMapping(path="/api/customers")
    List<Customer> customers();
}
