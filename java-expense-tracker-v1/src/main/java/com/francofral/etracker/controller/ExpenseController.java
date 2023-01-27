package com.francofral.etracker.controller;

import com.francofral.etracker.repository.ExpensesRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ExpenseController {

    private final ExpensesRepository expensesRepository;

}
