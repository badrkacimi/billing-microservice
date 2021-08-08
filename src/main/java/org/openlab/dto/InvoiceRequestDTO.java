package org.openlab.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data  @AllArgsConstructor@NoArgsConstructor

public class InvoiceRequestDTO {

	private BigDecimal amount;
    private String customerID;
	

}
