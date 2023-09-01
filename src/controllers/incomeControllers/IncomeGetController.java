package controllers.incomeControllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;

import java.util.List;

public class IncomeGetController {
  public static void incomeGetAll(){
    IncomeDao incomeDao = new IncomeDaoImpl();

    List<IncomeDto> incomes = incomeDao.getAll();
    for (IncomeDto income: incomes) {
      System.out.println(income.getId() + "\t"
              + income.getName() + "\t"
              + income.getDay() + "/"
              + income.getMonth() + "/"
              + income.getYear() + "\t"
              + income.getCategory() + "\t" + "$" +
              + income.getAmount());
    }
  }
}
