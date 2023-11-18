(package com.example.credit_calculator.Repo;

import com.example.credit_calculator.Entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankRepo extends JpaRepository<Bank,Long> {
//   @Query ("select new " +
//           "com.example.credit_calculator.DTO.response.TariffResponseDto" +
//           "(b.bankName,b.logoUrl) from Bank b join Tariff t on t.bank.id = b.id " +
//           "where b.id = :bId")
//     getBank (Long bid);


}
