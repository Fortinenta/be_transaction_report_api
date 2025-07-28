package com.hitachi.hcsid.transactionreportapi.repository;

import com.hitachi.hcsid.transactionreportapi.entity.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionItemRepository extends JpaRepository<TransactionItem, UUID> {
}