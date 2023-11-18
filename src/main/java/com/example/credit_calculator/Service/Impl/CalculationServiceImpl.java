package com.example.credit_calculator.Service.Impl;

import com.example.credit_calculator.DTO.response.TariffResponseDto;
import com.example.credit_calculator.Entity.Tariff;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.DTO.response.CalculationResponseDTO;
import com.example.credit_calculator.Repo.TariffRepo;
import com.example.credit_calculator.Service.CalculationService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalculationServiceImpl implements CalculationService {

    private final TariffRepo tariffRepo;

    @Override
    public CalculationResponseDTO getTariffs(CalculationRequestDTO calculationRequestDTO) {

//        TariffResponseDto tariffResponseDto = new TariffResponseDto();
//        tariffResponseDto.setCreditAmount();
        CalculationResponseDTO responseDTO = new CalculationResponseDTO();
        responseDTO.setTariffs(tariffRepo.findAll());
        return responseDTO;
    }

    private    TariffResponseDto getTariffResponseDto(CalculationRequestDTO calculationRequestDTO){
        int creditAmount = calculationRequestDTO.getCreditAmount();
        int creditTerm = calculationRequestDTO.getCreditTerm();
        double interestRate = getInterestRate(creditTerm,creditAmount);
        double  monthlyPayment = getTotalRepaymentAmount  ( creditAmount,creditTerm);
        double interestAmount = interestRate * creditAmount / 100.0;
        double totalRepaymentAmount = monthlyPayment + interestAmount;
        TariffResponseDto tariffResponseDto = new TariffResponseDto();
        tariffResponseDto.setCreditAmount(tariffResponseDto.getCreditAmount());
        tariffResponseDto.setMonthlyPayment(monthlyPayment);
        tariffResponseDto.setTotalRepaymentAmount(totalRepaymentAmount);
        return tariffResponseDto;
    };

    private double getTotalRepaymentAmount  (int creditAmount,int creditTerm){
        double totalAmount = getInterestRate(creditAmount, creditTerm);
        double creditTermInterestRate = creditTerm /12 /100;
        return creditAmount * creditTermInterestRate / totalAmount;
    }
    private double getInterestRate (int creditAmount,int creditTerm ){
        return tariffRepo.getInterestRate(creditAmount,creditTerm);
    };



}
