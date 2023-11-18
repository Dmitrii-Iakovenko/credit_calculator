package com.example.credit_calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.Entity.Tariff;
import com.example.credit_calculator.Service.TariffService; 

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/tariffs")
@RequiredArgsConstructor
public class TariffController {
    
    private final TariffService tariffService;

    @GetMapping("{id}")
    public ResponseEntity<Tariff> get(@PathVariable long id) {
        // tariffService.getById(id)
        
        // System.out.println("ok");
        // Tariff tariff = tariffService.getById(id);

        return ResponseEntity.ok(null);
    }


}
