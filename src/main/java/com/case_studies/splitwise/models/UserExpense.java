package com.case_studies.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    private Double amount;
    @ManyToOne
    private Expense expense;
    @Enumerated
    private ExpenseType expenseType;
}
