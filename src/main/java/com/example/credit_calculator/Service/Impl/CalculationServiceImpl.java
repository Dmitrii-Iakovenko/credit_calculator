package com.example.credit_calculator.Service.Impl;

import org.springframework.stereotype.Service;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.DTO.response.CalculationResponseDTO;
import com.example.credit_calculator.Repo.TariffRepo;
import com.example.credit_calculator.Service.CalculationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CalculationServiceImpl implements CalculationService {

    private final TariffRepo tariffRepo;

    @Override
    public CalculationResponseDTO getTariffs(CalculationRequestDTO calculationRequestDTO) {
        CalculationResponseDTO responseDTO = new CalculationResponseDTO();
        responseDTO.setTariffs(tariffRepo.findAll());
        return responseDTO;
    }

}
