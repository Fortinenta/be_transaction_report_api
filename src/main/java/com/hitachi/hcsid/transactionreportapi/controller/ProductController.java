package com.hitachi.hcsid.transactionreportapi.controller;

import com.hitachi.hcsid.transactionreportapi.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        // Placeholder for actual logic
        return ResponseEntity.ok(Arrays.asList(new ProductDTO()));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'STAFF')")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable UUID id) {
        // Placeholder for actual logic
        return ResponseEntity.ok(new ProductDTO());
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        // Placeholder for actual logic
        return ResponseEntity.ok(productDTO);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable UUID id, @RequestBody ProductDTO productDTO) {
        // Placeholder for actual logic
        return ResponseEntity.ok(productDTO);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteProduct(@PathVariable UUID id) {
        // Placeholder for actual logic
        return ResponseEntity.noContent().build();
    }
}
