package com.example.credit_calculator.Entity;

import jakarta.persistence.*;
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
    @ManyToOne
    CreditType creditType;
    @ManyToOne
    Bank bank;
    int maxCreditAmount;
    int minCreditAmount;
    int minCreditTerm;
    int maxCreditTerm;
    double interestRate;

}
