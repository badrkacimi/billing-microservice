package org.openlab.mapper;

import org.mapstruct.Mapper;
import org.openlab.dto.InvoiceRequestDTO;
import org.openlab.dto.InvoiceResponseDTO;
import org.openlab.entities.Invoice;

@Mapper(componentModel="spring")
public interface  InvoiceMapper {
	
    InvoiceResponseDTO invoiceToInvoiceDTO(Invoice invoice);
    Invoice invoiceDTOtoInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
