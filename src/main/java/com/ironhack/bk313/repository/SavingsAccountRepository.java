package com.ironhack.bk313.repository;

import com.ironhack.bk313.model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {
    // Add specific methods if needed
}
