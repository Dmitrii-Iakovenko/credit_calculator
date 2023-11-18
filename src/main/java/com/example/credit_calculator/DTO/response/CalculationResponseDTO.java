package com.example.credit_calculator.DTO.response;

import java.util.List;

import com.example.credit_calculator.Entity.Tariff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculationResponseDTO {

    private List<Tariff> tariffs;

}
