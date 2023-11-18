package com.example.credit_calculator.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculationRequestDTO {

    private int creditAmount;
    private int creditTerm;
    private String creditType;

}
