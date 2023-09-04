package test.testExpenseControllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;
import enums.CategoryExpense;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseUpdateControllerTest {

  @Test
  @DisplayName("Test to validate that the information contained can be modified")
  void updateExpense() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    ExpenseDto expenseDtoModify = new ExpenseDto();
    expenseDtoModify.setId(14);
    expenseDtoModify.setName("Prueba1");
    expenseDtoModify.setDay(28);
    expenseDtoModify.setMonth("noviembre");
    expenseDtoModify.setYear(2022);
    expenseDtoModify.setCategory(CategoryExpense.ENTRETENIMIENTO);
    expenseDtoModify.setAmount(450.00);
    expenseDao.update(expenseDtoModify);
  }
}