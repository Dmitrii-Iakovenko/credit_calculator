package com.example.credit_calculator.DTO.response;

import java.util.List;

import com.example.credit_calculator.Entity.CreditType;
import com.example.credit_calculator.Enum.Currency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InitializationResponseDTO {

    private List<Currency> currencies;
    private List<CreditType> creditTypes;
    
}
