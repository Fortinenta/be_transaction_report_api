package com.hitachi.hcsid.transactionreportapi.controller;

import com.hitachi.hcsid.transactionreportapi.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<List<TransactionDTO>> getAllTransactions() {
        // Placeholder for actual logic
        return ResponseEntity.ok(Arrays.asList(new TransactionDTO()));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<TransactionDTO> getTransactionById(@PathVariable UUID id) {
        // Placeholder for actual logic
        return ResponseEntity.ok(new TransactionDTO());
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<TransactionDTO> createTransaction(@RequestBody TransactionDTO transactionDTO) {
        // Placeholder for actual logic
        return ResponseEntity.ok(transactionDTO);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<TransactionDTO> updateTransaction(@PathVariable UUID id, @RequestBody TransactionDTO transactionDTO) {
        // Placeholder for actual logic
        return ResponseEntity.ok(transactionDTO);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteTransaction(@PathVariable UUID id) {
        // Placeholder for actual logic
        return ResponseEntity.noContent().build();
    }
}
