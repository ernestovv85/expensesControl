package test.testExpenseControllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseCreateControllerTest {

  @Test
  @DisplayName("Test of the method for saving a record")
  void testExpenseRegister() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    ExpenseDto expenseDto = new ExpenseDto();

  }
}