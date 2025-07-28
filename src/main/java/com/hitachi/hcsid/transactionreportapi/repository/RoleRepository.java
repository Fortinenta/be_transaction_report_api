package com.hitachi.hcsid.transactionreportapi.repository;

import com.hitachi.hcsid.transactionreportapi.entity.Role;
import com.hitachi.hcsid.transactionreportapi.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByName(RoleName name);
}