package test.testIncomeControllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;
import enums.CategoryIncome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncomeUpdateControllerTest {

  @Test
  @DisplayName("Test to validate that the information contained can be modified.")
  void updateIncome() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    IncomeDto incomeDtoModify = new IncomeDto();
    incomeDtoModify.setId(5);
    incomeDtoModify.setName("Prueba1");
    incomeDtoModify.setDay(8);
    incomeDtoModify.setMonth("septiembre");
    incomeDtoModify.setYear(2022);
    incomeDtoModify.setCategory(CategoryIncome.SUELDO);
    incomeDtoModify.setAmount(1500.00);
    incomeDao.update(incomeDtoModify);
  }
}