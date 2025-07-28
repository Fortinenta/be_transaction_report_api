package com.hitachi.hcsid.transactionreportapi.controller;

import com.hitachi.hcsid.transactionreportapi.dto.TaxDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/taxes")
public class TaxController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<List<TaxDTO>> getAllTaxes() {
        // Placeholder for actual logic
        return ResponseEntity.ok(Arrays.asList(new TaxDTO()));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<TaxDTO> getTaxById(@PathVariable UUID id) {
        // Placeholder for actual logic
        return ResponseEntity.ok(new TaxDTO());
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<TaxDTO> createTax(@RequestBody TaxDTO taxDTO) {
        // Placeholder for actual logic
        return ResponseEntity.ok(taxDTO);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<TaxDTO> updateTax(@PathVariable UUID id, @RequestBody TaxDTO taxDTO) {
        // Placeholder for actual logic
        return ResponseEntity.ok(taxDTO);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteTax(@PathVariable UUID id) {
        // Placeholder for actual logic
        return ResponseEntity.noContent().build();
    }
}
