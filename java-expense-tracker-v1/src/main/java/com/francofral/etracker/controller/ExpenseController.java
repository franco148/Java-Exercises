package com.francofral.etracker.controller;

import com.francofral.etracker.domain.Expense;
import com.francofral.etracker.domain.GroupBy;
import com.francofral.etracker.dto.ExpenseByGroupCriteria;
import com.francofral.etracker.repository.CategoryRepository;
import com.francofral.etracker.repository.ExpensesRepository;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@AllArgsConstructor
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpensesRepository expensesRepository;
    private final CategoryRepository categoryRepository;

    @PostMapping
    public void save(@RequestBody Expense expense) {
        if (isNull(expense.getCategory()) || isNull(expense.getCategory().getId())) {
            throw new RuntimeException("This expense does not have category. Specify the category and try again.");
        }

        var optionalCategory = categoryRepository.findById(expense.getCategory().getId());
        if (optionalCategory.isEmpty()) {
            throw new RuntimeException("The related category with id=" + expense.getCategory().getId() + " does not exist.");
        }

        expense.setDateTime(LocalDateTime.now());
        expense.setCategory(optionalCategory.get());

        expensesRepository.save(expense);
    }

    @GetMapping
    public List<ExpenseByGroupCriteria> getExpenses(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
                                     @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate,
                                     @RequestParam(name = "groupBy", defaultValue = "MONTHLY") GroupBy groupBy) {

        LocalDateTime fromDateTime = fromDate.atStartOfDay();
        LocalDateTime endDateTime = LocalDateTime.of(toDate, LocalTime.MAX);

        List<ExpenseByGroupCriteria> expensesResponse = new ArrayList<>();

        switch (groupBy) {
            case CATEGORY -> expensesResponse.addAll(expensesRepository.getExpensesGroupedByCategory(fromDateTime, endDateTime));
            case YEARLY -> expensesResponse.addAll(expensesRepository.getExpensesGroupedYearly(fromDateTime, endDateTime));
            case MONTHLY -> expensesResponse.addAll(expensesRepository.getExpensesGroupedMonthly(fromDateTime, endDateTime));
            case WEEKLY -> expensesResponse.addAll(expensesRepository.getExpensesGroupedWeekly(fromDateTime, endDateTime));
            case DAILY -> expensesResponse.addAll(expensesRepository.getExpensesGroupedDaily(fromDateTime, endDateTime));
        }

        return expensesResponse;
    }
}
