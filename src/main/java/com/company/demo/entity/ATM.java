package com.company.demo.entity;

import com.company.demo.entity.enums.BankName;
import com.company.demo.entity.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ATM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @Transient
    private Set<CardType> cardTypes;
    @Column(nullable = false)
    private Double max_amount;
    @Column(nullable = false)
    private BankName bankName;
    @Column(nullable = false)
    private Float input_commission;
    @Column(nullable = false)
    private Float output_commission;
    @Column(nullable = false)
    private Double min_amount;
    @ManyToMany
    private Set<Case> cases;
}
