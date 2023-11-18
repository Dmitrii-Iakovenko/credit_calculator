package com.example.credit_calculator.Repo;

import com.example.credit_calculator.Entity.CreditType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditTypeRepo extends JpaRepository<CreditType, Long> {
}
