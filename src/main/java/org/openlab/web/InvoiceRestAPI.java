package org.openlab.web;

import java.util.List;

import org.openlab.dto.InvoiceRequestDTO;
import org.openlab.dto.InvoiceResponseDTO;
import org.openlab.services.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class InvoiceRestAPI {
    private InvoiceService invoiceService;

    public InvoiceRestAPI(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> invoices(){
        return invoiceService.listInvoices();
    }
    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO invoice(@PathVariable String id){
        return invoiceService.getInvoice(id);
    }
    @PostMapping(path="/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiceService.newInvoice(invoiceRequestDTO);
    }
	
}
