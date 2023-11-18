package com.example.credit_calculator.Service.Impl;
import com.example.credit_calculator.Entity.Tariff;
import com.example.credit_calculator.Repo.TariffRepo;
import com.example.credit_calculator.Service.TariffService;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TariffServiceImpl implements TariffService {

    private final TariffRepo tariffRepo;
    
    public Optional<Tariff> getById(long id) {
        return tariffRepo.findById(id);
    }

}
