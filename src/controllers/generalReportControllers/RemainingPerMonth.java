package controllers.generalReportControllers;

import dao.ExpenseDao;
import dao.IncomeDao;
import dao.dto.ExpenseDto;
import dao.dto.IncomeDto;
import dao.impl.ExpenseDaoImpl;
import dao.impl.IncomeDaoImpl;

import java.util.List;
import java.util.Scanner;

public class RemainingPerMonth {
  public static void remainingPerMonth() {
    double expenseSum = 0, incomeSum = 0, result;
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    Scanner in = new Scanner(System.in);
    System.out.println("Indique primero la informacion de gastos");
    System.out.println("Digite el mes, dé enter y después el año que solicita:");
    String expenseMonth= in.nextLine().toLowerCase();
    int year= in.nextInt();
    List<ExpenseDto> expenseByMonth = expenseDao.getByMonth(expenseMonth, year);
    for(ExpenseDto expense: expenseByMonth) {
      expenseSum += expense.getAmount();
    }
    IncomeDao incomeDao = new IncomeDaoImpl();
    System.out.println("Ahora indique la información de ingresos");
    System.out.println("Digite el mes, dé enter y después el año que solicita:");
    in.nextLine();
    List<IncomeDto> incomeByMonth = incomeDao.getByMonth(in.nextLine().toLowerCase(), in.nextInt());
    for (IncomeDto income: incomeByMonth) {
      incomeSum += income.getAmount();
    }
    result= incomeSum - expenseSum;
    System.out.println("Su restante el mes de " + expenseMonth + " del año " + year + ", es de: $" + result);
  }
}
