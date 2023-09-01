package controllers.expenseControllers;

import dao.ExpenseDao;
import dao.impl.ExpenseDaoImpl;

import java.util.Scanner;

public class ExpenseDeleteController {
  public static void deleteExpense() {
    Scanner in = new Scanner(System.in);
    ExpenseDao expenseDao = new ExpenseDaoImpl();
    System.out.println(
            "NOTA: Una vez eliminado el registro, no se puede recuperar\n" +
                    "Verifique bien el id del registro antes de borrar\n" +
                    "Indique el id del registro que desea eliminar:"
    );
    expenseDao.delete(in.nextInt());
  }
}
