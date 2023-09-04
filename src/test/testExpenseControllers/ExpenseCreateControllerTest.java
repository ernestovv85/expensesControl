package test.testExpenseControllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;
import enums.CategoryExpense;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseCreateControllerTest {

  @Test
  @DisplayName("Test of the method for saving a record")
  void testExpenseRegister() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    ExpenseDto expenseDto = new ExpenseDto();
    expenseDto.setName("Prueba");
    expenseDto.setDay(12);
    expenseDto.setMonth("octubre");
    expenseDto.setYear(2021);
    expenseDto.setCategory(CategoryExpense.ENTRETENIMIENTO);
    expenseDto.setAmount(300.00);
    expenseDao.create(expenseDto);
  }
}