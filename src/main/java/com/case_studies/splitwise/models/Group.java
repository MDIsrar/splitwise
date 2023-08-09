package com.case_studies.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "expense_groups")
public class Group extends BaseModel{
    private String name;
    @ManyToMany
    private List<User> members;
    @ManyToMany
    private List<User> admins;
    @ManyToOne
    private User createdBy;
}
