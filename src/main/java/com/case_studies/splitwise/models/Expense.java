package com.case_studies.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private String description;
    private Double amount;
    private Date createOn;
    @ManyToOne
    private Group group;
    @ManyToMany
    private List<User> user = new ArrayList<>();
    @OneToMany
    private List<UserExpense> paidBy = new ArrayList<>();
    @OneToMany
    private List<UserExpense> owedBy = new ArrayList<>();

}
