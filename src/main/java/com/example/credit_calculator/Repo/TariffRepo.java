package com.example.credit_calculator.Repo;

import com.example.credit_calculator.Entity.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffRepo extends JpaRepository <Tariff, Long> {
    @Query ("select t.interestRate from Tariff t " +
            "where t.maxCreditAmount <= :creditAmount " +
            "and :creditAmount >= t.minCreditAmount " +
            "and :creditTerm >= t.maxCreditTerm" )
    double getInterestRate(int creditAmount,int creditTerm);
}
