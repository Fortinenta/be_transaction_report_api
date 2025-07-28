package com.hitachi.hcsid.transactionreportapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @GetMapping("/daily-summary")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<String> getDailySummaryReport() {
        // Placeholder for actual logic
        return ResponseEntity.ok("Daily Summary Report Data");
    }

    @GetMapping("/monthly-sales")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<BigDecimal> getMonthlySalesReport() {
        // Placeholder for actual logic
        return ResponseEntity.ok(new BigDecimal("1234567.89"));
    }

    @GetMapping("/product-sales")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<String> getProductSalesReport() {
        // Placeholder for actual logic
        return ResponseEntity.ok("Product Sales Report Data");
    }
}
