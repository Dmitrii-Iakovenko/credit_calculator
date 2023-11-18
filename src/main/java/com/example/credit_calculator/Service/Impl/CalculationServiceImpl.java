package com.example.credit_calculator.Service.Impl;

import com.example.credit_calculator.DTO.response.TariffResponseDto;
import com.example.credit_calculator.Entity.Tariff;

import org.springframework.stereotype.Service;

import com.example.credit_calculator.DTO.request.CalculationRequestDTO;
import com.example.credit_calculator.DTO.response.CalculationResponseDTO;
import com.example.credit_calculator.Repo.TariffRepo;
import com.example.credit_calculator.Service.CalculationService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CalculationServiceImpl implements CalculationService {

    private final TariffRepo tariffRepo;

    @Override
    public CalculationResponseDTO getTariffs(CalculationRequestDTO calculationRequestDTO) {
        
        int creditAmount = calculationRequestDTO.getCreditAmount();
        int creditTerm = calculationRequestDTO.getCreditTerm();
        String creditType = calculationRequestDTO.getCreditType();

         List<Tariff> tariffs = tariffRepo.customFind(creditAmount, creditTerm, creditType);
       // List<Tariff> tariffs = tariffRepo.findAll();


        List<TariffResponseDto> tariffDTOs = tariffs.stream()
            .map(tariff -> toDTO(tariff, creditAmount, creditTerm))
            .collect(Collectors.toList());

        CalculationResponseDTO responseDTO = new CalculationResponseDTO();
        responseDTO.setTariffs(tariffDTOs);
        return responseDTO;
    }

    private TariffResponseDto toDTO(Tariff tariff, int creditAmount, int creditTerm) {
        double interestAmount = tariff.getInterestRate() * creditAmount / 100;
        double totalRepaymentAmount = interestAmount + creditAmount;
//        double monthlyPayment = getMonthlyRepaymentAmount
//                (totalRepaymentAmount, creditTerm,creditAmount);
        double monthlyPayment = totalRepaymentAmount / creditTerm;
        String creditType = tariff.getCreditType().getTypeCred();
        String bankName = tariff.getBank().getBankName();
        String logoUrl = tariff.getBank().getLogoUrl();

        TariffResponseDto tariffResponseDto = new TariffResponseDto();
        tariffResponseDto.setCreditAmount(creditAmount);
        tariffResponseDto.setMonthlyPayment(monthlyPayment);
        tariffResponseDto.setTotalRepaymentAmount(totalRepaymentAmount);
        tariffResponseDto.setCreditType(creditType);
        tariffResponseDto.setBankName(bankName);        
        tariffResponseDto.setLogoUrl(logoUrl);

        return tariffResponseDto;
    };

//    private double getMonthlyRepaymentAmount(double totalRepaymentAmount, int creditTerm,int creditAmount) {
//        return creditAmount * ;
//    }

}
