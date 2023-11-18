package com.example.credit_calculator.Entity;

import com.example.credit_calculator.Enum.Currency;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    @Enumerated(EnumType.STRING)    
    Currency currency;
    int maxSum;
    int minSum;
    int minSrok;
    int maxSrok;

}
