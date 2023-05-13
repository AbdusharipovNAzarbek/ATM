package com.company.demo.entity;

import com.company.demo.entity.enums.CaseName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private CaseName caseName;
    private Integer bill_count;
    private Double money_amount;
    @ManyToMany
    private Set<Bill> bills;

}
