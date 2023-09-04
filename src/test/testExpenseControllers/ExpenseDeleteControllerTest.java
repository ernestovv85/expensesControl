package test.testExpenseControllers;

import dao.ExpenseDao;
import dao.impl.ExpenseDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseDeleteControllerTest {

  @Test
  @DisplayName("Test to validate the operation of deleting a field")
  void deleteExpense() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    int id = 25;
    expenseDao.delete(id);
  }
}