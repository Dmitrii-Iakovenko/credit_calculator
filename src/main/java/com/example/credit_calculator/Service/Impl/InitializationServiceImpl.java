package com.example.credit_calculator.Service.Impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.credit_calculator.DTO.response.InitializationResponseDTO;
import com.example.credit_calculator.Entity.CreditType;
import com.example.credit_calculator.Enum.Currency;
import com.example.credit_calculator.Repo.CreditTypeRepo;
import com.example.credit_calculator.Service.InitializationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InitializationServiceImpl implements InitializationService {

    private final CreditTypeRepo creditTypeRepo;

    @Override
    public InitializationResponseDTO initialization() {
        InitializationResponseDTO responseDTO = new InitializationResponseDTO();
        Currency[] arr = Currency.values();
        System.out.println(arr);
        List<Currency> currencies = Arrays.asList(Currency.values());        
        // List<Currency> currencies = Arrays.asList(Currency.class.getEnumConstants());

        List<CreditType> creditTypes = creditTypeRepo.findAll();
        responseDTO.setCreditTypes(creditTypes);
        responseDTO.setCurrencies(currencies);
        return responseDTO;
    }
    
}
