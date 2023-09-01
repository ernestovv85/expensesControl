package controllers.expenseControllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;

import java.util.List;
import java.util.Scanner;

public class ExpenseGetController {
  public static void getAllExpenses() {
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

  public static void getExpenseByMonth() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    Scanner in = new Scanner(System.in);
    System.out.println("Digite el mes, dé enter y después el año que desea consultar:");
    List<ExpenseDto> expenseByMonth = expenseDao.getByMonth(in.nextLine().toLowerCase(), in.nextInt());
    for (ExpenseDto expense: expenseByMonth) {
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

  public static void getExpenseByYear() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    Scanner in = new Scanner(System.in);
    System.out.println("Digite el año que desea consultar:");
    List<ExpenseDto> expenseByYear = expenseDao.getByYear(in.nextInt());
    for (ExpenseDto expense: expenseByYear) {
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
