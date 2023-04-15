package com.francofral.etracker.dto;

import com.francofral.etracker.domain.GroupBy;

import java.math.BigDecimal;

public interface ExpenseByGroupCriteria {

    Long getCategoryId();
    String getCategoryName();
    BigDecimal getTotalExpenses();

    GroupBy getGroupCriteria();
    Integer getPeriodCriteria();
    Integer getNumberOfOperations();

}
