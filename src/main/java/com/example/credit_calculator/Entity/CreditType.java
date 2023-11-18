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
public class CreditType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String typeCred;

}