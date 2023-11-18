package com.example.credit_calculator.Repo;

import com.example.credit_calculator.Entity.Bank;
import com.example.credit_calculator.Entity.CreditType;
import com.example.credit_calculator.Entity.Tariff;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffRepo extends JpaRepository <Tariff, Long> {

     @Query ("select t from Tariff t " +
             "where t.maxCreditAmount >= :creditAmount and :creditAmount >= t.minCreditAmount " +
             "and :creditTerm <= t.maxCreditTerm and :creditTerm >= t.minCreditTerm " +
             "and :creditType = t.creditType.typeCred"
         )
     List<Tariff> customFind(int creditAmount, int creditTerm, String creditType);
    // List<Tariff> findByMaxCreditAmountGreaterThanEqualAndMinCreditAmountLessThanEqualAndMaxCreditTermGreaterThanEqualAndMinCreditTermLessThanEqualAndCreditType(int creditAmount, int creditTerm, String creditType);

    
}
