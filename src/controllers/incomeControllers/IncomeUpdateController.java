package controllers.incomeControllers;

import dao.IncomeDao;
import dao.dto.IncomeDto;
import dao.impl.IncomeDaoImpl;
import enums.CategoryIncome;

import java.util.Scanner;

public class IncomeUpdateController {
  private static final Scanner in = new Scanner(System.in);
  public static void updateIncome() {
    IncomeDao incomeDao = new IncomeDaoImpl();

    IncomeDto incomeDto = new IncomeDto();
    System.out.println("Digite el id del registro que desea modificar:");
    incomeDto.setId(in.nextInt());
    in.nextLine();
    System.out.println("Digite la información solicitada:");
    System.out.println("Digite el nuevo nombre:");
    incomeDto.setName(in.nextLine().toUpperCase());
    System.out.println("Digite el nuevo día:");
    incomeDto.setDay(in.nextInt());
    in.nextLine();
    System.out.println("Digite el nuevo mes:");
    incomeDto.setMonth(in.nextLine().toLowerCase());
    System.out.println("Digite el nuevo año:");
    incomeDto.setYear(in.nextInt());
    System.out.println(
          "Seleccione la nueva categoría:\n" +
          "1. Sueldo\n" +
          "2. Extra");
        int option = in.nextInt();
        switch(option) {
          case 1: incomeDto.setCategory(CategoryIncome.SUELDO);
          break;
          case 2: incomeDto.setCategory(CategoryIncome.EXTRA);
          break;
          default:
            System.out.println("No se encontró la opción seleccionada. Intente de nuevo:");
            updateIncome();
        }
    System.out.println("Digite la nueva cantidad:");
    incomeDto.setAmount(in.nextInt());

    incomeDao.update(incomeDto);
  }
}
