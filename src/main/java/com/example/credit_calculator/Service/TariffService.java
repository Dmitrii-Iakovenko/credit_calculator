package com.example.credit_calculator.Service;
import java.util.Optional;

import com.example.credit_calculator.Entity.Tariff;

public interface TariffService {

    Optional<Tariff> getById(long id);

}
