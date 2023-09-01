package controllers.incomeControllers;

import dao.IncomeDao;
import dao.impl.IncomeDaoImpl;

import java.util.Scanner;

public class IncomeDeleteController {
  public static void deleteIncome() {
    Scanner in = new Scanner(System.in);
    IncomeDao incomeDao = new IncomeDaoImpl();
    System.out.println(
            "NOTA: Una vez eliminado el registro, no se puede recuperar\n" +
            "Verifique bien el id del registro antes de borrar\n" +
            "Indique el id del registro que desea eliminar:"
    );
    incomeDao.delete(in.nextInt());
  }
}
