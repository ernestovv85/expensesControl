package controllers.incomeControllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;

import java.util.List;
import java.util.Scanner;

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

  public static void incomeGetByMonth() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    Scanner in = new Scanner(System.in);
    System.out.println("Digite el mes, dé enter y después el año que desea consultar:");
    List<IncomeDto> incomeByMonth = incomeDao.getByMonth(in.nextLine().toLowerCase(), in.nextInt());
    for (IncomeDto income: incomeByMonth) {
      System.out.println(income.getId() + "\t"
              + income.getName() + "\t"
              + income.getDay() + "/"
              + income.getMonth() + "/"
              + income.getYear() + "\t"
              + income.getCategory() + "\t" + "$" +
              + income.getAmount());
    }
  }

  public static void getIncomeByYear() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    Scanner in = new Scanner(System.in);
    System.out.println("Digite el año que desea consultar:");
    List<IncomeDto> incomeByYear = incomeDao.getByYear(in.nextInt());
    for (IncomeDto income: incomeByYear) {
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
