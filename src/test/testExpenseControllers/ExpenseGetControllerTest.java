package test.testExpenseControllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseGetControllerTest {

  @Test
  @DisplayName("Test to validate that the information of all content is displayed")
  void getAllExpenses() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    List<ExpenseDto> expenses = expenseDao.getAll();
    for (ExpenseDto expense: expenses){
      System.out.println(expense);
    }
  }
}