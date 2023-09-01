package menus;

import java.util.Scanner;

import static controllers.expenseControllers.ExpenseCreateController.expenseRegister;
import static controllers.expenseControllers.ExpenseDeleteController.deleteExpense;
import static controllers.expenseControllers.ExpenseGetController.*;
import static controllers.expenseControllers.ExpenseUpdateController.updateExpense;
import static menus.AlternativeMenu.alternativeMenuExpense;
import static menus.GeneralMenu.generalMenu;

public class ExpenseMenu {
  private static final Scanner in = new Scanner(System.in);

  public static void expenseMenu() {
    System.out.println("Elija la opción deseada:");
    System.out.println(
            "1. Agregar gasto\n" +
            "2. Historial de gastos\n" +
            "3. Gastos por mes\n" +
            "4. Gastos por año\n" +
            "5. Modificar gasto\n" +
            "6. Eliminar gasto\n" +
            "7. Menú anterior\n" +
            "8. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        System.out.println("Agregar gasto");
        expenseRegister();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 2:
        System.out.println("Historial de gastos");
        getAllExpenses();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 3:
        System.out.println("Gastos por mes");
        getExpenseByMonth();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 4:
        System.out.println("Gastos por año");
        getExpenseByYear();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 5:
        System.out.println("Modificación de gastos");
        updateExpense();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 6:
        System.out.println("Eliminación de gastos");
        deleteExpense();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 7:
        generalMenu();
        break;
      case 8:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        expenseMenu();
    }
  }
}
