package com.example.credit_calculator.Service;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.DTO.response.CalculationResponseDTO;

public interface CalculationService {

    CalculationResponseDTO getTariffs(CalculationRequestDTO calculationRequestDTO);

}
