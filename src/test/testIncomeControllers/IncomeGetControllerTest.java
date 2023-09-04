package test.testIncomeControllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class IncomeGetControllerTest {

  @Test
  @DisplayName("Test to validate that the information of all content is displayed")
  void testGetAllIncomes() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    List<IncomeDto> incomes = incomeDao.getAll();
    for (IncomeDto income: incomes){
      System.out.println(income);
    }
  }
}