package com.example.credit_calculator.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String creditType;
    int maxCreditAmount;
    int minCreditAmount;
    int minCreditTerm;
    int maxCreditTerm;
    double interestRate;

}
