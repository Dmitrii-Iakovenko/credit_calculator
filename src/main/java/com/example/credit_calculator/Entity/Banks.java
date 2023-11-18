package com.example.credit_calculator.Entity;

import com.example.credit_calculator.Enum.Val;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Banks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bankName;
   // String typeCred;
    @Enumerated(EnumType.STRING)
    Val val;



}
