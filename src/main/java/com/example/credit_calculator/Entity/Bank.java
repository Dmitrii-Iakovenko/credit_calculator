package com.example.credit_calculator.Entity;

import com.example.credit_calculator.Enum.Currency;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bankName;
    String logoUrl;

}
