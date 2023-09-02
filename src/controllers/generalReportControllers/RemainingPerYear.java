package controllers.generalReportControllers;

import dao.ExpenseDao;
import dao.IncomeDao;
import dao.dto.ExpenseDto;
import dao.dto.IncomeDto;
import dao.impl.ExpenseDaoImpl;
import dao.impl.IncomeDaoImpl;

import java.util.List;
import java.util.Scanner;

public class RemainingPerYear {
  public static void remainingPerYear() {
    double expenseSum = 0, incomeSum = 0, result;
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    Scanner in = new Scanner(System.in);
    System.out.println("Indique primero la información de gastos.");
    System.out.println("Digite el año que solicita:");
    int year = in.nextInt();
    List<ExpenseDto> expenseByYear = expenseDao.getByYear(year);
    for (ExpenseDto expense: expenseByYear) {
      expenseSum += expense.getAmount();
    }
    IncomeDao incomeDao = new IncomeDaoImpl();
    System.out.println("Ahora indique la información de ingresos");
    System.out.println("Digite el año que solicita:");
    List<IncomeDto> incomeByYear = incomeDao.getByYear(in.nextInt());
    for (IncomeDto income: incomeByYear) {
      incomeSum += income.getAmount();
    }
    result = incomeSum - expenseSum;
    System.out.println("Su restante del año " + year +", es de: $" + result);
  }
}
