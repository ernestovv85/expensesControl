package controllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;
import enums.CategoryExpense;

import java.util.Scanner;

public class ExpenseCreateController {
  private static final Scanner in = new Scanner(System.in);

  public static void expenseRegister() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    System.out.println("Ingrese la información solicitada para registrar el ingreso.");

    ExpenseDto expenseDto = new ExpenseDto();
    System.out.println("Ingrese el nombre del ingreso:");
    expenseDto.setName(in.nextLine());
    System.out.println("Ingrese el número de día del mes que se gastó:");
    expenseDto.setDay(in.nextInt());
    System.out.println("Ingrese el nombre del mes que se gastó:");
    expenseDto.setMonth(in.nextLine());
    System.out.println("Ingrese el año en que se gastó, a cuatro dígitos:");
    expenseDto.setYear(in.nextInt());
    System.out.println("Elija el tipo de ingreso, de la siguiente lista:");
    System.out.println("1. Alimentos\n"
                    + "2. Servicios\n"
                    + "3. Renta\n"
                    + "4. Créditos\n"
                    + "5. Entretenimiento\n"
                    + "6. Salud\n"
                    + "7. Educación\n"
                    + "8. Ropa\n"
                    + "9. Calzado");
    int options = in.nextInt();
    switch(options) {
      case 1: expenseDto.setCategory(CategoryExpense.ALIMENTOS);
      break;
      case 2: expenseDto.setCategory(CategoryExpense.SERVICIOS);
      break;
      case 3: expenseDto.setCategory(CategoryExpense.RENTA);
      break;
      case 4: expenseDto.setCategory(CategoryExpense.CREDITOS);
      break;
      case 5: expenseDto.setCategory(CategoryExpense.ENTRETENIMIENTO);
      break;
      case 6: expenseDto.setCategory(CategoryExpense.SALUD);
      break;
      case 7: expenseDto.setCategory(CategoryExpense.EDUCACION);
      break;
      case 8: expenseDto.setCategory(CategoryExpense.ROPA);
      break;
      case 9: expenseDto.setCategory(CategoryExpense.CALZADO);
      break;
      default:
        System.out.println("No se encontró la opción digitada.");
    }
    System.out.println("Ingrese la cantidad:");
    expenseDto.setAmount(in.nextDouble());

    expenseDao.create(expenseDto);
  }
}
