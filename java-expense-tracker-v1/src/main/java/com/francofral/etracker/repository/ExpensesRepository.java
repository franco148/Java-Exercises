package com.francofral.etracker.repository;

import com.francofral.etracker.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expense, Long> {
}
