package test.testGeneralReportControllers;

import dao.ExpenseDao;
import dao.IncomeDao;
import dao.dto.ExpenseDto;
import dao.dto.IncomeDto;
import dao.impl.ExpenseDaoImpl;
import dao.impl.IncomeDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainingPerMonthTest {

  @Test
  @DisplayName("Test to get remaining amount per month")
  void testRemainingPerMonth() {
    double incomeSum = 0, expenseSum = 0, result;
    IncomeDao incomeDao = new IncomeDaoImpl();
    String month = "agosto";
    int year = 2023;
    List<IncomeDto> incomesDtoByMonth = incomeDao.getByMonth(month, year);
    for (IncomeDto income: incomesDtoByMonth){
      incomeSum += income.getAmount();
    }
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    List<ExpenseDto> expenseDtoByMonth = expenseDao.getByMonth(month, year);
    for (ExpenseDto expense: expenseDtoByMonth){
      expenseSum += expense.getAmount();
    }
    result = incomeSum - expenseSum;
    System.out.println(result);
  }
}