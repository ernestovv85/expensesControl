package controllers.expenseControllers;

import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import dao.impl.ExpenseDaoImpl;
import enums.CategoryExpense;

import java.util.Scanner;

public class ExpenseUpdateController {
  private static final Scanner in = new Scanner(System.in);
  public static void updateExpense() {
    ExpenseDao expenseDao = new ExpenseDaoImpl();

    ExpenseDto expenseDto = new ExpenseDto();
    System.out.println("Indique el id del registro que desea modificar:");
    expenseDto.setId(in.nextInt());
    in.nextLine();
    System.out.println("Ingrese la información solicitada:");
    System.out.println("Ingrese el nuevo nombre:");
    expenseDto.setName(in.nextLine());
    System.out.println("Ingreses el nuevo día:");
    expenseDto.setDay(in.nextInt());
    in.nextLine();
    System.out.println("Ingrese el nuevo mes:");
    expenseDto.setMonth(in.nextLine());
    System.out.println("Ingrese el nuevo año:");
    expenseDto.setYear(in.nextInt());
    System.out.println("Elija el tipo de gasto, de la siguiente lista:");
    System.out.println("1. Alimentos\n"
            + "2. Artículos para el hogar\n"
            + "3. Servicios\n"
            + "4. Transporte\n"
            + "5. Renta\n"
            + "6. Créditos\n"
            + "7. Entretenimiento\n"
            + "8. Salud\n"
            + "9. Educación\n"
            + "10. Ropa\n"
            + "11. Calzado");
    int options = in.nextInt();
    switch(options) {
      case 1: expenseDto.setCategory(CategoryExpense.ALIMENTOS);
        break;
      case 2: expenseDto.setCategory(CategoryExpense.HOGAR);
        break;
      case 3: expenseDto.setCategory(CategoryExpense.SERVICIOS);
        break;
      case 4: expenseDto.setCategory(CategoryExpense.TRANSPORTE);
        break;
      case 5: expenseDto.setCategory(CategoryExpense.RENTA);
        break;
      case 6: expenseDto.setCategory(CategoryExpense.CREDITOS);
        break;
      case 7: expenseDto.setCategory(CategoryExpense.ENTRETENIMIENTO);
        break;
      case 8: expenseDto.setCategory(CategoryExpense.SALUD);
        break;
      case 9: expenseDto.setCategory(CategoryExpense.EDUCACION);
        break;
      case 10: expenseDto.setCategory(CategoryExpense.ROPA);
        break;
      case 11: expenseDto.setCategory(CategoryExpense.CALZADO);
        break;
      default:
        System.out.println("No se encontró la opción digitada. Comience de nuevo.");
        updateExpense();
    }
    System.out.println("Ingrese la nueva cantidad:");
    expenseDto.setAmount(in.nextDouble());

    expenseDao.update(expenseDto);
  }
}
