package com.hitachi.hcsid.transactionreportapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    // Endpoints for Customer Management will be implemented here

    @GetMapping
    public String getAllCustomers() {
        return "List of all customers";
    }
}
