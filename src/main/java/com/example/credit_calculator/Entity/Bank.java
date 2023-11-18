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
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bankName;
    String logoUrl;

}
