package test.testIncomeControllers;

import dao.IncomeDao;
import dao.impl.IncomeDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncomeDeleteControllerTest {

  @Test
  @DisplayName("Test to validate the operation of deleting a field")
  void testDeleteIncome() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    int id = 15;
    incomeDao.delete(id);
  }
}