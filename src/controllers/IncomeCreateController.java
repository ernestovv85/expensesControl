package controllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;
import enums.CategoryIncome;

import java.util.Scanner;

public class IncomeCreateController {
  private static final Scanner in = new Scanner(System.in);
  public static void incomeRegister() {
    IncomeDao incomeDao = new IncomeDaoImpl();
    System.out.println("Ingrese la información solicitada para registrar el ingreso.");

    IncomeDto incomeDto= new IncomeDto();
    System.out.println("Ingrese el nombre del ingreso:");
    incomeDto.setName(in.nextLine());
    System.out.println("Ingrese el número de día del mes en que se recibió:");
    incomeDto.setDay(in.nextInt());
    System.out.println("Ingrese el nombre del mes en que se recibió:");
    incomeDto.setMonth(in.nextLine());
    System.out.println("Ingrese el año en que se recibió, a cuatro dígitos:");
    incomeDto.setYear(in.nextInt());
    System.out.println("Elija el tipo de ingreso, de la siguiente lista:");
    System.out.println("1. Sueldo\n" + "2. Crédito\n" + "3. Extra");
    int options = in.nextInt();
    switch(options) {
      case 1: incomeDto.setCategory(CategoryIncome.SUELDO);
      break;
      case 2: incomeDto.setCategory(CategoryIncome.CREDITO);
      break;
      case 3: incomeDto.setCategory(CategoryIncome.EXTRA);
      break;
      default:
        System.out.println("No se encontró la opción seleccionada.");
    }
    System.out.println("Ingrese la cantidad:");
    incomeDto.setAmount(in.nextDouble());

    incomeDao.create(incomeDto);
  }
}
