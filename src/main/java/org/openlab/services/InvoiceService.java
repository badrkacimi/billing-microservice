package org.openlab.services;

import java.util.List;

import org.openlab.dto.InvoiceRequestDTO;
import org.openlab.dto.InvoiceResponseDTO;

public interface InvoiceService {
	
	 InvoiceResponseDTO getInvoice(String id);
	 List<InvoiceResponseDTO> listInvoices();
	 InvoiceResponseDTO newInvoice(InvoiceRequestDTO invoiceRequestDTO);

}
