package com.francofral.etracker.dto;

import java.math.BigDecimal;

public interface ExpenseByGroupCriteria {

    Long getCategoryId();
    String getCategoryName();
    BigDecimal getTotalExpenses();

    Integer getPeriodCriteria();
    Integer getNumberOfOperations();

}
