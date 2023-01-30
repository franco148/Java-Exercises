package com.francofral.etracker.repository;

import com.francofral.etracker.domain.Expense;
import com.francofral.etracker.dto.ExpenseByGroupCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expense, Long> {

    @Query(value = """
        SELECT e.category_id AS categoryId, c.name AS categoryName, sum(e.amount) AS totalExpenses 
        FROM expenses e JOIN categories c ON c.id = e.category_id 
        WHERE e.date_time BETWEEN :fromDate AND :toDate
        GROUP BY category_id
    """, nativeQuery = true)
    List<ExpenseByGroupCriteria> getExpensesGroupedByCategory(@Param("fromDate") LocalDateTime fromDate,
                                                              @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT year(date_time) AS periodCriteria, count(*) AS numberOfOperations, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY year(date_time)
    """, nativeQuery = true)
    List<ExpenseByGroupCriteria> getExpensesGroupedYearly(@Param("fromDate") LocalDateTime fromDate,
                                                          @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT month(date_time) AS periodCriteria, count(*) AS numberOfOperations, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY month(date_time)
    """, nativeQuery = true)
    List<ExpenseByGroupCriteria> getExpensesGroupedMonthly(@Param("fromDate") LocalDateTime fromDate,
                                                           @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT week(date_time) AS periodCriteria, count(*) AS numberOfOperations, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY week(date_time)
    """, nativeQuery = true)
    List<ExpenseByGroupCriteria> getExpensesGroupedWeekly(@Param("fromDate") LocalDateTime fromDate,
                                                          @Param("toDate") LocalDateTime toDate);

    @Query(value = """
        SELECT day(date_time) AS periodCriteria, count(*) AS numberOfOperations, sum(amount) AS totalExpenses 
        FROM expenses e 
        WHERE date_time BETWEEN :fromDate AND :toDate 
        GROUP BY day(date_time)
    """, nativeQuery = true)
    List<ExpenseByGroupCriteria> getExpensesGroupedDaily(@Param("fromDate") LocalDateTime fromDate,
                                                         @Param("toDate") LocalDateTime toDate);

    @Query("SELECT DISTINCT(YEAR(e.dateTime)) FROM Expense e GROUP BY e.dateTime")
    List<Integer> getRegisteredYears();
}
