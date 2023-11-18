package com.example.credit_calculator.Repo;

import com.example.credit_calculator.Entity.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffRepo extends JpaRepository <Tariff,Long>{
}
