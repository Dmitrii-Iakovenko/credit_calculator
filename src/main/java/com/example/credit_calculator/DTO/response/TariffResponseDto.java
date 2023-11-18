package com.example.credit_calculator.DTO.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TariffResponseDto {
     int creditAmount;
     double monthlyPayment;
     double TotalRepaymentAmount;
     String creditType;
     String bankName;
     String logoUrl;

}
