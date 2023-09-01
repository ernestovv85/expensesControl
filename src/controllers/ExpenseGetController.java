package controllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;

import java.util.List;

public class ExpenseGetController {
  public static void expenseGetAll() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();

    List<ExpenseDto> expenses = expenseDao.getAll();
    for (ExpenseDto expense: expenses) {
      System.out.println(
              expense.getId() + "\t" +
              expense.getName() + "\t" +
              expense.getDay() + "/" +
              expense.getMonth() + "/" +
              expense.getYear() + "\t" +
              expense.getCategory() + "\t" + "$" +
              expense.getAmount()
      );
    }
  }
}
