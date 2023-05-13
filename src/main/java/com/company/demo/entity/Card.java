package com.company.demo.entity;

import com.company.demo.entity.enums.BankName;
import com.company.demo.entity.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Card {
    @Id
    private UUID id;
    @Column(nullable = false, length = 16)
    private String card_number;
    @Column(nullable = false)
    private BankName bankName;
    @Column(nullable = false, length = 3)
    private int svv_code;
    @Column(nullable = false)
    private String card_holder_name;
    @Column(nullable = false)
    private LocalDate expire_date = LocalDate.now().plusYears(5);
    @Column(nullable = false, length = 4)
    private int pin_code = 1111;
    @Column(nullable = false)
    private CardType cardType;
    @Column(nullable = false)
    private boolean isActive = true;
}
