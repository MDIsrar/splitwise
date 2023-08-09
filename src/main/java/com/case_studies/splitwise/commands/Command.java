package com.case_studies.splitwise.commands;

public interface Command {
    // 1. It needs to check if it can execute against a particular user input
    boolean matches(String input);
    void execute(String input);
}
