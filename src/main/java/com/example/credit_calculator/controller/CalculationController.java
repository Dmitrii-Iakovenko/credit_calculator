package com.example.credit_calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.Entity.Tariff;
import com.example.credit_calculator.Service.TariffService;

import lombok.RequiredArgsConstructor; 


@RestController
@RequestMapping("/api/v1/calculation")
@RequiredArgsConstructor
public class CalculationController {
    
//    @PostMapping
//    public ResponseEntity<CalculationRequestDTO> getTariffs(@RequestBody CalculationRequestDTO calculationRequestDTO ) {
//        CalculationRequestDTO tariffsDTO = calculationService.getTariffs(calculationRequestDTO);
//        return ResponseEntity.ok(tariffsDTO);
//    }

}
