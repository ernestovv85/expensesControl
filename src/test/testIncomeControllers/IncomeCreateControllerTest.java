package test.testIncomeControllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;
import enums.CategoryIncome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncomeCreateControllerTest {

  @Test
  @DisplayName("Test of the method for saving a record")
  void testIncomeRegister() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    IncomeDto incomeDto = new IncomeDto();
    incomeDto.setName("Quincena");
    incomeDto.setDay(15);
    incomeDto.setMonth("octubre");
    incomeDto.setYear(2023);
    incomeDto.setCategory(CategoryIncome.SUELDO);
    incomeDto.setAmount(2800.00);
    incomeDao.create(incomeDto);
  }
}