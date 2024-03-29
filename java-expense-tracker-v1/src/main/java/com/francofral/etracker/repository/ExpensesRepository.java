package com.francofral.etracker.repository;

import com.francofral.etracker.domain.Expense;
import com.francofral.etracker.dto.ExpenseResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expense, Long> {

    @Query(value = """
        SELECT e.category_id AS categoryId, c.name AS categoryName, count(*) AS numberOfOperations, 'CATEGORY' AS groupCriteria, sum(e.amount) AS totalExpenses 
        FROM expenses e JOIN categories c ON c.id = e.category_id 
        WHERE e.date_time BETWEEN :fromDate AND :toDate
        GROUP BY category_id
    """, nativeQuery = true)
    List<ExpenseResponseDto> getExpensesGroupedByCategory(@Param("fromDate") LocalDateTime fromDate,
                                                          @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT year(date_time) AS periodCriteria, count(*) AS numberOfOperations, 'YEARLY' AS groupCriteria, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY year(date_time)
    """, nativeQuery = true)
    List<ExpenseResponseDto> getExpensesGroupedYearly(@Param("fromDate") LocalDateTime fromDate,
                                                      @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT month(date_time) AS periodCriteria, count(*) AS numberOfOperations, 'MONTHLY' AS groupCriteria, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY month(date_time)
    """, nativeQuery = true)
    List<ExpenseResponseDto> getExpensesGroupedMonthly(@Param("fromDate") LocalDateTime fromDate,
                                                       @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT week(date_time) AS periodCriteria, count(*) AS numberOfOperations, 'WEEKLY' AS groupCriteria, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY week(date_time)
    """, nativeQuery = true)
    List<ExpenseResponseDto> getExpensesGroupedWeekly(@Param("fromDate") LocalDateTime fromDate,
                                                      @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT day(date_time) AS periodCriteria, count(*) AS numberOfOperations, 'DAILY' AS groupCriteria, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY day(date_time)
    """, nativeQuery = true)
    List<ExpenseResponseDto> getExpensesGroupedDaily(@Param("fromDate") LocalDateTime fromDate,
                                                     @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT e.category_id AS categoryId, c.name AS categoryName, 1 AS numberOfOperations, 'NONE' AS groupCriteria,
               e.id AS expenseId, e.date_time AS expenseDateTime, e.amount AS totalExpenses, e.name AS expenseName, e.details AS expenseDetails
        FROM expenses e JOIN categories c ON c.id = e.category_id
        WHERE e.date_time BETWEEN :fromDate AND :toDate
    """, nativeQuery = true)
    List<ExpenseResponseDto> getNonGroupedExpenses(@Param("fromDate") LocalDateTime fromDate,
                                                   @Param("toDate") LocalDateTime toDate);

    @Query("SELECT DISTINCT(YEAR(e.dateTime)) FROM Expense e GROUP BY e.dateTime")
    List<Integer> getRegisteredYears();
}
