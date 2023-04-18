package com.francofral.etracker.dto;

import com.francofral.etracker.domain.GroupBy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ExpenseByGroupCriteria {

    Long getCategoryId();
    String getCategoryName();

    Long getExpenseId();
    LocalDateTime getExpenseDateTime();
    String getExpenseName();
    String getExpenseDetails();
    BigDecimal getTotalExpenses();

    GroupBy getGroupCriteria();
    Integer getPeriodCriteria();
    Integer getNumberOfOperations();

}
