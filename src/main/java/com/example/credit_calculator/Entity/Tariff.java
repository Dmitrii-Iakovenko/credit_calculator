package com.example.credit_calculator.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
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
