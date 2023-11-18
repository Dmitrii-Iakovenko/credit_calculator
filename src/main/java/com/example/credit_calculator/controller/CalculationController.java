package com.example.credit_calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.DTO.response.CalculationResponseDTO;
import com.example.credit_calculator.Service.CalculationService;

import lombok.RequiredArgsConstructor; 


@RestController
@RequestMapping("/api/v1/calculation")
@RequiredArgsConstructor
public class CalculationController {

    private final CalculationService calculationService;
    @PostMapping
    public ResponseEntity<CalculationResponseDTO> getTariffs(@RequestBody CalculationRequestDTO calculationRequestDTO ) {
        CalculationResponseDTO tariffsDTO = calculationService.getTariffs(calculationRequestDTO);
        return ResponseEntity.ok(tariffsDTO);
    }
}
