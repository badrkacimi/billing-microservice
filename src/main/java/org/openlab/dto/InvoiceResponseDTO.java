package org.openlab.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.openlab.entities.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data  @AllArgsConstructor@NoArgsConstructor

public class InvoiceResponseDTO {

    private String id;
    private Date date;
    private BigDecimal amount;
    private Customer customer;
	

}
