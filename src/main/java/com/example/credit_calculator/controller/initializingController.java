package com.example.credit_calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.credit_calculator.DTO.response.InitializationResponseDTO;
import com.example.credit_calculator.Service.InitializationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/initialization")
@RequiredArgsConstructor
public class initializingController {
    
    private final InitializationService initializationService;

    @GetMapping
    public ResponseEntity<InitializationResponseDTO> initialization() {
        return ResponseEntity.ok(initializationService.initialization());
    }

}
